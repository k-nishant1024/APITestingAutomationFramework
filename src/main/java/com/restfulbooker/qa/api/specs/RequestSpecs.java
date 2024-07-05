package com.restfulbooker.qa.api.specs;

import com.restfulbooker.qa.api.config.ApiConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {



    public static RequestSpecification defaultSpecs() {
        return new RequestSpecBuilder()
                .setBaseUri(ApiConfig.BASE_URL)
                .addHeader("Content-Type", "application/json").build();

    }

    public static RequestSpecification authSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(ApiConfig.BASE_URL)
                .addHeader("Content-Type", "application/json")
                .build();
    }
}
