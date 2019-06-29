package singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigHelper {

    private static ConfigHelper instance;

    private Map<String, String> config;

    private ConfigHelper() {
        config = new HashMap<>();

        Path path = Paths.get("config.txt");
        try {
            System.out.println("Czytanie konfiguracji");
            //log.tag=TAG
            Files.lines(path)
                    .filter(line -> line.contains("="))
                    .forEach(line -> {
                        String[] split = line.split("=");
                        String key = split[0];
                        String value = split[1];
                        config.put(key, value);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigHelper getInstance() {
        if (instance == null) {
            synchronized (ConfigHelper.class) {
                if (instance == null) {
                    instance = new ConfigHelper();
                }
            }
        }

        return instance;
    }

    public Map<String, String> getConfig() {
        return config;
    }
}