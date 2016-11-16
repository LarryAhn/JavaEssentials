package com.zuperztarahn.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Ahn on 2016. 11. 17..
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {

        localDateTimeUseWithDateTimeFormatter();

    }

    public static void localDateTimeUseWithDateTimeFormatter() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before result : " + now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(dateTimeFormatter);
        System.out.println("After result : " + formatDateTime);
    }

}
