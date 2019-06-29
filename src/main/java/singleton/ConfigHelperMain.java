package singleton;

import java.util.Map;

public class ConfigHelperMain {

    public static void main(String[] args) {
        Map<String, String> config =
                ConfigHelper.getInstance().getConfig();

        System.out.println(config.get("log.tag"));

        config = ConfigHelper.getInstance().getConfig();

        System.out.println(config.get("log.tag"));
    }
}
