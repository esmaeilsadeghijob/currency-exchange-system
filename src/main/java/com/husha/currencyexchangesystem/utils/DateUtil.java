package com.husha.currencyexchangesystem.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String formatDate(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }

    public static LocalDateTime parseDate(String dateString) {
        return LocalDateTime.parse(dateString, FORMATTER);
    }
}
