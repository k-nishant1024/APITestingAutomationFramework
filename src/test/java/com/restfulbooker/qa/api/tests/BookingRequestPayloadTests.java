package com.restfulbooker.qa.api.tests;

import com.restfulbooker.qa.api.endpoints.BookingEndpoint;
import com.restfulbooker.qa.api.pojo.BookingRequestPayload;
import com.restfulbooker.qa.api.pojo.BookingResponsePayload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.testng.Assert.assertEquals;

public class BookingRequestPayloadTests {

    @Test
    public void testGetAllBookingIdsReturns200(){
        Response response = BookingEndpoint.getAllBookingIds();
        assertEquals(response.getStatusCode(),SC_OK);
    }

    @Test
    void testGetAllBookingIdsReturnsNonEmptyArray() {
        BookingResponsePayload[] bookingResponsePayloads = BookingEndpoint.getAllBookingIds().as(BookingResponsePayload[].class);
        assertThat(bookingResponsePayloads.length,greaterThan(0));
    }

//    @Test
//    void testGetBookingIdsByNameReturns200() {
//        Response response = BookingEndpoint.get("sally", "brown");
//
//        assertThat(response.statusCode(), equalTo(SC_OK));
//    }
//    @Test
//    public void getBookingFilterByName(){
//        response = BookingEndpoint.GetBookingIdsFilterByName("Josh","Allen");
//        assertEquals(response.getStatusCode(),200);
//        System.out.println(response.asString());
//    }
//
//    @Test
//    public void getBookingFilterByDate(){
//
//        response = BookingEndpoint.GetBookingIdsFilterDate("2098-04-02","2099-12-21");
//        assertEquals(response.getStatusCode(),200);
//        System.out.println(response.asString());
//    }
//
//    @Test
//    public void getBookingByID(){
//        response = BookingEndpoint.GetBookingByID("1405");
//        System.out.println(response.asString());
//        assertEquals(response.getStatusCode(),200);
//        System.out.println(response.as(BookingRequestPayload.class).getFirstname());
//    }
//
////    @Test
////    public void createBookingTest(){
////        BookingRequestPayload bookingRequestPayload = new BookingRequestPayload("Nishantkr", "Gupta", 11, true, new BookingRequestPayload.BookingDates("2098-04-02", "2099-12-21"), "Breakfast" );
////        response = BookingEndpoint.createBooking(bookingRequestPayload);
////        System.out.println(response.asString());
////        Assert.assertEquals(response.getStatusCode(),200);
////        System.out.println(response.as(BookingRequestPayload.class).getTotalprice());
////    }
//
//
//



}