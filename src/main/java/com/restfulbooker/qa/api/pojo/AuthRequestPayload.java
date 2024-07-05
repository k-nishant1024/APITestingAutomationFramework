package com.restfulbooker.qa.api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
public class AuthRequestPayload {
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
}
