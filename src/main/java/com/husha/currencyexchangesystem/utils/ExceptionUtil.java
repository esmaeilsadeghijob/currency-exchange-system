package com.husha.currencyexchangesystem.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ExceptionUtil {
    public static void throwUnauthorized() {
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "دسترسی غیرمجاز");
    }

    public static void throwBadRequest(String message) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, message);
    }
}

