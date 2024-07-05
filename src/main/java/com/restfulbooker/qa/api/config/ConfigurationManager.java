package com.restfulbooker.qa.api.config;

import java.io.InputStream;
import java.util.Properties;


import java.io.IOException;

public class ConfigurationManager {
    private static final String CONFIG_FILE = "api.properties";
    private static final Properties properties = new Properties();

    static {
        try (InputStream inputStream = ConfigurationManager.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}


