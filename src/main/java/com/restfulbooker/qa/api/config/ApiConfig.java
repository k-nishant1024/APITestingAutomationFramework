package com.restfulbooker.qa.api.config;

public class ApiConfig {
    public static final String BASE_URL = ConfigurationManager.getProperty("api.base.url");
    public static final String AUTH_ENDPOINT = ConfigurationManager.getProperty("api.auth.endpoint");
    public static final String BOOKING_ENDPOINT = ConfigurationManager.getProperty("api.booking.endpoint");
}
