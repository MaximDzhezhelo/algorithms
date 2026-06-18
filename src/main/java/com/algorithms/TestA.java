package com.algorithms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestA {

    static void main() {
        final var from = LocalDate.now().minusYears(1L);
        final var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        final var to = LocalDateTime.now().format(formatter);
        final var s = "SELECT * FROM c1.recharge_card_used WHERE USE_DATE between TO_DATE('" + from + "','YYYY-MM-DD') and TO_DATE('" + to + "','DD.MM.YYYY HH24:MI:SS') and SERIAL_NUMBER=" + 44790;
        System.out.println(s);
    }

}
