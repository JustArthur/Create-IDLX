package com.vladiscrafter.createidlx.config;

public class CIDLXServer extends CIDLXConfigBase {

    public final ConfigBool hideEscapingOfDisabledSpecifiers = b(false, "hideEscapingOfDisabledPlaceholders", Comments.hideEscapingOfDisabledSpecifiers);
    public final ConfigBool enableCrudeProgressBarSupport = b(false, "enableProgressBarPlaceholdersSupport", Comments.enableCrudeProgressBarSupport);
//    public final ConfigBool useSpaceInDefaultConcatenation = b(true, "useSpaceInDefaultConcatenation", Comments.useSpaceInDefaultConcatenation);

    public final ConfigGroup placeholdersSettings = group(1, "placeholdersSettings", "Placeholders Settings");
    public final ConfigBool enableBracketsSpecifier = b(true, "enableCurlyBracketsPlaceholder", Comments.enableBracketsSpecifier);
    public final ConfigBool enableDollarSpecifier = b(true, "enableDollarSignPlaceholder", Comments.enableDollarSpecifier);

    public final ConfigGroup displaySourceSettings = group(1, "displaySourceSettings", "Display Source Settings");

//    public final ConfigGroup newDisplaySources = group(2, "newDisplaySources", "New Display Sources");
//    public final ConfigBool enableCurrentFloorExtendedDisplaySource = b(true, "enableCurrentFloorExtendedDisplaySource", Comments.enableCurrentFloorExtendedDisplaySource);
//    public final ConfigBool enableCountdownDisplaySource = b(true, "enableCountdownDisplaySource", Comments.enableCountdownDisplaySource);

//    public final ConfigGroup existingDisplaySources = group(2, "existingDisplaySources", "Existing Display Sources");
    public final ConfigBool enhanceCurrentFloorDisplaySource = b(true, "enhanceCurrentFloorDisplaySource", Comments.enhanceCurrentFloorDisplaySource);
    public final ConfigBool enhanceTrainStatusDisplaySource = b(true, "enhanceTrainStatusDisplaySource", Comments.enhanceTrainStatusDisplaySource);

    @Override public String getName() { return "server"; }

    private static class Comments {
        static String hideEscapingOfDisabledSpecifiers = "Hide backslashes placed before the disabled placeholders.";
        static String enableCrudeProgressBarSupport = "Allow usage of placeholders for the Progress Bar display format (the bar characters will incorrectly appear as non-wide).";
        static String useSpaceInDefaultConcatenation = "Separate the label from the information string with a space (if no placeholders are present).";

        static String enableBracketsSpecifier = "Treat {} (curly brackets) as a placeholder for the Attached Label.";
        static String enableDollarSpecifier = "Treat $ (dollar sign) as a placeholder for the Attached Label.";

        static String enableCurrentFloorExtendedDisplaySource = "Enable the Current Floor Extended display source.";
        static String enableCountdownDisplaySource = "Enable the Countdown display source.";

        static String enhanceCurrentFloorDisplaySource = "Add Attached Label functionality to the Current Floor display source from Create.";
        static String enhanceTrainStatusDisplaySource = "Add Attached Label functionality to the Train Status display source from Create.";
    }
}
