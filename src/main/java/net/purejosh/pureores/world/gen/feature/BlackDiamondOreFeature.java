package net.purejosh.pureores.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ChunkSectionCache;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.purejosh.pureores.world.ModGameRules;

import java.util.BitSet;
import java.util.Objects;

public class BlackDiamondOreFeature extends OreFeature {
    private static int passedAttempts = 0;
    private static int failedAttempts = 0;

    public BlackDiamondOreFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    @Override
    protected boolean generateVeinPart(StructureWorldAccess world, Random random, OreFeatureConfig config, double startX, double endX, double startZ, double endZ, double startY, double endY, int x, int y, int z, int horizontalSize, int verticalSize) {

        MinecraftServer server = world.getServer();
        assert server != null;
        int oreGenerationChance = server.getGameRules().getInt(ModGameRules.BLACK_DIAMOND_ORE_GEN);

        if (random.nextInt(100) >= oreGenerationChance) {
            failedAttempts++;
            return false;
        } else {
            passedAttempts++;
        }

        int i = 0;
        BitSet bitSet = new BitSet(horizontalSize * verticalSize * horizontalSize);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int j = config.size;
        double[] ds = new double[j * 4];

        for(int k = 0; k < j; ++k) {
            float f = (float)k / (float)j;
            double d = MathHelper.lerp(f, startX, endX);
            double e = MathHelper.lerp(f, startY, endY);
            double g = MathHelper.lerp(f, startZ, endZ);
            double h = random.nextDouble() * (double)j / (double)16.0F;
            double l = ((double)(MathHelper.sin((float)Math.PI * f) + 1.0F) * h + (double)1.0F) / (double)2.0F;
            ds[k * 4] = d;
            ds[k * 4 + 1] = e;
            ds[k * 4 + 2] = g;
            ds[k * 4 + 3] = l;
        }

        for(int k = 0; k < j - 1; ++k) {
            if (!(ds[k * 4 + 3] <= (double)0.0F)) {
                for(int m = k + 1; m < j; ++m) {
                    if (!(ds[m * 4 + 3] <= (double)0.0F)) {
                        double d = ds[k * 4] - ds[m * 4];
                        double e = ds[k * 4 + 1] - ds[m * 4 + 1];
                        double g = ds[k * 4 + 2] - ds[m * 4 + 2];
                        double h = ds[k * 4 + 3] - ds[m * 4 + 3];
                        if (h * h > d * d + e * e + g * g) {
                            if (h > (double)0.0F) {
                                ds[m * 4 + 3] = -1.0F;
                            } else {
                                ds[k * 4 + 3] = -1.0F;
                            }
                        }
                    }
                }
            }
        }

        try (ChunkSectionCache chunkSectionCache = new ChunkSectionCache(world)) {
            for(int m = 0; m < j; ++m) {
                double d = ds[m * 4 + 3];
                if (!(d < (double)0.0F)) {
                    double e = ds[m * 4];
                    double g = ds[m * 4 + 1];
                    double h = ds[m * 4 + 2];
                    int n = Math.max(MathHelper.floor(e - d), x);
                    int o = Math.max(MathHelper.floor(g - d), y);
                    int p = Math.max(MathHelper.floor(h - d), z);
                    int q = Math.max(MathHelper.floor(e + d), n);
                    int r = Math.max(MathHelper.floor(g + d), o);
                    int s = Math.max(MathHelper.floor(h + d), p);

                    for(int t = n; t <= q; ++t) {
                        double u = ((double)t + (double)0.5F - e) / d;
                        if (u * u < (double)1.0F) {
                            for(int v = o; v <= r; ++v) {
                                double w = ((double)v + (double)0.5F - g) / d;
                                if (u * u + w * w < (double)1.0F) {
                                    for(int aa = p; aa <= s; ++aa) {
                                        double ab = ((double)aa + (double)0.5F - h) / d;
                                        if (u * u + w * w + ab * ab < (double)1.0F && !world.isOutOfHeightLimit(v)) {
                                            int ac = t - x + (v - y) * horizontalSize + (aa - z) * horizontalSize * verticalSize;
                                            if (!bitSet.get(ac)) {
                                                bitSet.set(ac);
                                                mutable.set(t, v, aa);
                                                if (world.isValidForSetBlock(mutable)) {
                                                    ChunkSection chunkSection = chunkSectionCache.getSection(mutable);
                                                    if (chunkSection != null) {
                                                        int ad = ChunkSectionPos.getLocalCoord(t);
                                                        int ae = ChunkSectionPos.getLocalCoord(v);
                                                        int af = ChunkSectionPos.getLocalCoord(aa);
                                                        BlockState blockState = chunkSection.getBlockState(ad, ae, af);

                                                        for(OreFeatureConfig.Target target : config.targets) {
                                                            Objects.requireNonNull(chunkSectionCache);
                                                            if (shouldPlace(blockState, chunkSectionCache::getBlockState, random, config, target, mutable)) {
                                                                chunkSection.setBlockState(ad, ae, af, target.state, false);
                                                                ++i;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return i > 0;

    }
    // Method to get the number of passed attempts
    public static int getPassedAttempts() {
        return passedAttempts;
    }

    // Method to get the number of failed attempts
    public static int getFailedAttempts() {
        return failedAttempts;
    }

    // Method to reset the counters
    public static void resetCounters() {
        passedAttempts = 0;
        failedAttempts = 0;
    }
}