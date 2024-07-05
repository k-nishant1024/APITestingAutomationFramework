package com.restfulbooker.qa.api.tests;

import com.restfulbooker.qa.api.base.BaseTest;
import com.restfulbooker.qa.api.endpoints.AuthEndpoint;
import com.restfulbooker.qa.api.pojo.AuthRequestPayload;
import com.restfulbooker.qa.api.pojo.AuthResponsePayload;
import io.restassured.response.Response;
import static org.testng.Assert.*;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class AuthTests extends BaseTest {
    protected String token;
    @Test
    public void testCreateTokenReturns200(){
        AuthRequestPayload authRequestPayload = AuthRequestPayload.builder().username("admin").password("password123").build();
        Response response = AuthEndpoint.createToken(authRequestPayload);
        token = response.as(AuthResponsePayload.class).getToken();
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK,"Expected status code 200 (OK) but received " + response.getStatusCode() +
                ". Please ensure the authentication endpoint is functioning correctly.");
    }

    @Test
    void testCreateTokenReturnsNonEmptyToken() {
        assertNotNull(token, "Token should not be null. Ensure the authentication endpoint is working correctly and returning a valid token.");
    }

}
