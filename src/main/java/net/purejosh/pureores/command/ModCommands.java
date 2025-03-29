package net.purejosh.pureores.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.purejosh.pureores.world.gen.feature.*;

public class ModCommands {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("pureoresdebugmoonstonegen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugmoonstonegen));
        dispatcher.register(CommandManager.literal("pureoresdebugfireopalgen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugfireopalgen));
        dispatcher.register(CommandManager.literal("pureoresdebugjadeitegen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugjadeitegen));
        dispatcher.register(CommandManager.literal("pureoresdebugametrinegen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugametrinegen));
        dispatcher.register(CommandManager.literal("pureoresdebugchrysoberylgen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugchrysoberylgen));
        dispatcher.register(CommandManager.literal("pureoresdebugsapphiregen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugsapphiregen));
        dispatcher.register(CommandManager.literal("pureoresdebugblackdiamondgen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebugblackdiamondgen));
        dispatcher.register(CommandManager.literal("pureoresdebuglonsdaleitegen").requires(source -> source.hasPermissionLevel(2)).executes(ModCommands::pureoresdebuglonsdaleitegen));
    }

    private static int pureoresdebugmoonstonegen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Moonstone", MoonstoneOreFeature.getPassedAttempts(), MoonstoneOreFeature.getFailedAttempts(), MoonstoneOreFeature::resetCounters);
    }

    private static int pureoresdebugfireopalgen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Fire Opal", FireOpalOreFeature.getPassedAttempts(), FireOpalOreFeature.getFailedAttempts(), FireOpalOreFeature::resetCounters);
    }

    private static int pureoresdebugjadeitegen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Jadeite", JadeiteOreFeature.getPassedAttempts(), JadeiteOreFeature.getFailedAttempts(), JadeiteOreFeature::resetCounters);
    }

    private static int pureoresdebugametrinegen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Ametrine", AmetrineOreFeature.getPassedAttempts(), AmetrineOreFeature.getFailedAttempts(), AmetrineOreFeature::resetCounters);
    }

    private static int pureoresdebugchrysoberylgen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Chrysoberyl", ChrysoberylOreFeature.getPassedAttempts(), ChrysoberylOreFeature.getFailedAttempts(), ChrysoberylOreFeature::resetCounters);
    }

    private static int pureoresdebugsapphiregen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Sapphire", SapphireOreFeature.getPassedAttempts(), SapphireOreFeature.getFailedAttempts(), SapphireOreFeature::resetCounters);
    }

    private static int pureoresdebugblackdiamondgen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Black Diamond", BlackDiamondOreFeature.getPassedAttempts(), BlackDiamondOreFeature.getFailedAttempts(), BlackDiamondOreFeature::resetCounters);
    }

    private static int pureoresdebuglonsdaleitegen(CommandContext<ServerCommandSource> context) {
        return handleOreGenerationSummary(context, "Lonsdaleite", LonsdaleiteMeteoriteFeature.getPassedAttempts() ,LonsdaleiteMeteoriteFeature.getFailedAttempts(), LonsdaleiteMeteoriteFeature::resetCounters);
    }

    private static int handleOreGenerationSummary(CommandContext<ServerCommandSource> context, String oreName, int passedAttempts, int failedAttempts, Runnable resetCounters) {
        int totalAttempts = passedAttempts + failedAttempts;
        double successRate = totalAttempts > 0 ? (double) passedAttempts / totalAttempts * 100 : 0;

        // Send the summary to the game chat
        context.getSource().sendFeedback(() -> Text.literal(oreName + " Ore Generation Summary:"), false);
        context.getSource().sendFeedback(() -> Text.literal("Passed/Failed Attempts: " + passedAttempts + "/" + failedAttempts), false);
        context.getSource().sendFeedback(() -> Text.literal("Success Rate: " + String.format("%.2f", successRate) + "%"), false);

        // Reset the counters
        resetCounters.run();

        return Command.SINGLE_SUCCESS;
    }

    // Class initializer called from the entrypoint
    public static void init() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated, ignored) -> ModCommands.register(dispatcher));
    }
}