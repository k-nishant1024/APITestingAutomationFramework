package com.restfulbooker.qa.api.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonUtils {
    // Utility class for JSON processing

    public static JsonPath parseJson(Response response) {
        return response.jsonPath();
    }

    // Add more JSON processing utilities as needed
}
