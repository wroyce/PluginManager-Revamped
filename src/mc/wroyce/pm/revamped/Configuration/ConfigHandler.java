package mc.wroyce.pm.revamped.Configuration;

import mc.wroyce.pm.revamped.Configuration.Handlers.ConfigDataHandler;
import mc.wroyce.pm.revamped.Configuration.Handlers.Translation.*;

public class ConfigHandler {

    private static ConfigDataHandler configDataHandler = new ConfigDataHandler();
    private static EnglishDataHandler englishDataHandler = new EnglishDataHandler();
    private static DanishDataHandler danishDataHandler = new DanishDataHandler();
    private static FrenchDataHandler frenchDataHandler = new FrenchDataHandler();
    private static GermanDataHandler germanDataHandler = new GermanDataHandler();
    private static SpanishDataHandler spanishDataHandler = new SpanishDataHandler();

    public static void setupConfiguration() {
        englishDataHandler.setup();
        configDataHandler.setup();
        danishDataHandler.setup();
        frenchDataHandler.setup();
        germanDataHandler.setup();
        spanishDataHandler.setup();
    }
}
