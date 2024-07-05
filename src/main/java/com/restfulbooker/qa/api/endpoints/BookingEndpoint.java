package com.restfulbooker.qa.api.endpoints;

import com.restfulbooker.qa.api.config.ApiConfig;
import com.restfulbooker.qa.api.pojo.BookingRequestPayload;
import com.restfulbooker.qa.api.specs.RequestSpecs;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BookingEndpoint {

    public static Response getAllBookingIds(){
       return given()
                .spec(RequestSpecs.defaultSpecs())
                .when()
                .get(ApiConfig.BOOKING_ENDPOINT).then().extract().response();
    }

    public static Response GetBookingIdsFilterByName(String firstname, String lastname){
        return given()
                .spec(RequestSpecs.defaultSpecs())
                .queryParam("firstname",firstname)
                .queryParam("lastname",lastname)
                .when()
                .get(ApiConfig.BOOKING_ENDPOINT).then().extract().response();
    }

    public static Response GetBookingIdsFilterDate(String checkin, String checkout){
        return given()
                .spec(RequestSpecs.defaultSpecs())
                .queryParam("Checkin",checkin)
                .queryParam("Checkout",checkout)
                .when()
                .get(ApiConfig.BOOKING_ENDPOINT).then().extract().response();
    }

    public static Response GetBookingByID(String id){
        return given()
                .spec(RequestSpecs.defaultSpecs())
                .when()
                .get(ApiConfig.BOOKING_ENDPOINT + "/" + id).then().extract().response();
    }

    public static Response createBooking(BookingRequestPayload bookingRequestPayload){
        return given()
                .spec(RequestSpecs.defaultSpecs())
                .body(bookingRequestPayload)
                .when()
                .post(ApiConfig.BOOKING_ENDPOINT)
                .then().extract().response();
    }




}
