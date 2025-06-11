package com.husha.currencyexchangesystem.utils;

import org.springframework.http.HttpHeaders;

public class RequestUtil {
    public static HttpHeaders createAuthHeaders(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        return headers;
    }
}
