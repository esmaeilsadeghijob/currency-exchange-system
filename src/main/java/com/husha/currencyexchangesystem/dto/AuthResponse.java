package com.husha.currencyexchangesystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private String accessToken;
    private String tokenType;
    private int expiresIn;

    public AuthResponse(String accessToken, String tokenType, int expiresIn) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
    }
}
