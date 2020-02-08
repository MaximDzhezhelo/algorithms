package com.algorithms.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {

    public static void main(String [] args){
        Function<Integer, Integer> first = x -> x + 1;
        Function<Integer, String> second = x -> "Cool result: " + x;
        Function<Integer, Integer> third = x -> x * 3;

        final Integer applyFirst = first.apply(5);
        System.out.println("applyFirst: " + applyFirst);

        final String applySecond = second.apply(5);
        System.out.println("applySecond: " + applySecond);

        final Integer applyCompose = first.compose(third).apply(5);
        System.out.println("applyCompose is 16: " + (applyCompose == 16));

        final Function<Function<Integer, Integer>, Integer> fourth = x -> helper(x);
        final Integer applyFifth = fourth.apply(third);
        System.out.println("applyFifth " + applyFifth);

        final BiFunction<Function<Integer, Integer>,Integer, Integer> fifth = (x,b) -> helper(x, b);
        final Integer fifthFifth = fifth.apply(third, 3);
        System.out.println("fifthFifth " + fifthFifth);

    }

    public static Integer helper(final Function<Integer, Integer> help, final Integer multiplier){
        return help.apply(multiplier);
    }

    public static Integer helper(final Function<Integer, Integer> help){
        return help.apply(1);
    }

}