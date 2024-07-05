package com.restfulbooker.qa.api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingRequestPayload {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    @JsonProperty("bookingdates")
    private BookingDates bookingdates;
    private String additionalneeds;

//    public BookingRequestPayload() {
//    }
//
//    public BookingRequestPayload(String firstname, String lastname, int totalprice, boolean depositpaid, BookingDates bookingdates, String additionalneeds) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.totalprice = totalprice;
//        this.depositpaid = depositpaid;
//        this.bookingdates = bookingdates;
//        this.additionalneeds = additionalneeds;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public int getTotalprice() {
//        return totalprice;
//    }
//
//    public void setTotalprice(int totalprice) {
//        this.totalprice = totalprice;
//    }
//
//    public boolean isDepositpaid() {
//        return depositpaid;
//    }
//
//    public void setDepositpaid(boolean depositpaid) {
//        this.depositpaid = depositpaid;
//    }
//
//    public BookingDates getBookingdates() {
//        return bookingdates;
//    }
//
//    public void setBookingdates(BookingDates bookingdates) {
//        this.bookingdates = bookingdates;
//    }
//
//    public String getAdditionalneeds() {
//        return additionalneeds;
//    }
//
//    public void setAdditionalneeds(String additionalneeds) {
//        this.additionalneeds = additionalneeds;
//    }
//

    @Jacksonized
    @Builder
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BookingDates {
        private String checkin;
        private String checkout;
    }




}
