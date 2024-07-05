package com.restfulbooker.qa.api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class AuthResponsePayload {
    @JsonProperty
    private String token;
}
