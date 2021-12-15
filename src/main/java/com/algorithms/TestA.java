package com.algorithms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestA {

    public static void main(String[] args) {
        final LocalDate from = LocalDate.now().minusYears(1L);
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        final String to = LocalDateTime.now().format(formatter);
        final String s = "SELECT * FROM c1.recharge_card_used WHERE USE_DATE between TO_DATE('" + from + "','YYYY-MM-DD') and TO_DATE('" + to + "','DD.MM.YYYY HH24:MI:SS') and SERIAL_NUMBER=" + 44790;
        System.out.println(s);
    }

}
