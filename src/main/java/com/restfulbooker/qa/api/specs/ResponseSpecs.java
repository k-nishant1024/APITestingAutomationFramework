package com.restfulbooker.qa.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.lessThan;


public class ResponseSpecs {
    private static final long MAX_RESPONSE_TIME = 5000; // Maximum response time in milliseconds

    public static ResponseSpecification defaultSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(SC_OK)
                .expectResponseTime(lessThan(MAX_RESPONSE_TIME))
                .build();
    }
//
//    public static ResponseSpecification createdSpec() {
//        return new ResponseSpecBuilder()
//                .expectStatusCode(201)
//                .expectResponseTime(lessThan(MAX_RESPONSE_TIME))
//                .build();
//    }
//
//    public static ResponseSpecification noContentSpec() {
//        return new ResponseSpecBuilder()
//                .expectStatusCode(204)
//                .expectResponseTime(lessThan(MAX_RESPONSE_TIME))
//                .build();
//    }
//
//    public static ResponseSpecification badRequestSpec() {
//        return new ResponseSpecBuilder()
//                .expectStatusCode(400)
//                .expectResponseTime(lessThan(MAX_RESPONSE_TIME))
//                .build();
//    }

}
