package com.restfulbooker.qa.api.endpoints;

import static io.restassured.RestAssured.*;

import com.restfulbooker.qa.api.config.ApiConfig;
import com.restfulbooker.qa.api.pojo.AuthRequestPayload;
import com.restfulbooker.qa.api.specs.RequestSpecs;
import com.restfulbooker.qa.api.specs.ResponseSpecs;
import io.restassured.response.Response;

public class AuthEndpoint {
    public static Response createToken(AuthRequestPayload requestBody){
        return given()
                .spec(RequestSpecs.defaultSpecs())
                .body(requestBody)
                .when()
                .post(ApiConfig.AUTH_ENDPOINT)
                .then()
                .spec(ResponseSpecs.defaultSpec())
                .extract().response();
    }
}
