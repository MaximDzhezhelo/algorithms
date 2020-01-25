package com.stepic.bitShift;

public class bitShift {

    public static void main(String[] args) {
        final int x = 342;
        final String binaryX = Integer.toBinaryString(x);
        System.out.println(binaryX);

        final String noBinaryX = Integer.toBinaryString(~x);
        System.out.println(noBinaryX);

//        &
//        100010101 — число 277 в двоичной форме
//        110110000 — число 432 в двоичной форме
//        100010000 — результат работы 272
        System.out.println(277&432);

//        |
//        100010101 — число 277 в двоичной форме
//        110110000 — число 432 в двоичной форме
//        110110101 — результат работы 437

        System.out.println(277|432);


//        побитовое исключающее “ИЛИ” (также известно как XOR)
//        100010101 — число 277 в двоичной форме
//        110110000 — число 432 в двоичной форме
//        010100101 — результат работы 165
        System.out.println(277^432);
    }
}