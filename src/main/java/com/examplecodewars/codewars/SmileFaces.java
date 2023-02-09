package com.examplecodewars.codewars;

import java.util.Arrays;
import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {

        List<String> nouse = Arrays.asList("-", "~");
        List<String> eyes = Arrays.asList(":", ";");
        List<String> mouths = Arrays.asList(")", "D");

//        return (int) arr.stream()
//                .filter(smile -> eyes.contains(smile.substring(0, 1)))
//                .filter(smile -> {
//                    boolean hasnouse = nouse.contains(smile.substring(1, 2));
//                    System.out.println(smile);
//                    return hasnouse ? smile.length() < 4 && mouths.contains(smile.substring(2, 3)) : smile.length() < 3 && mouths.contains(smile.substring(1, 2));
//                })
//                .count();

//        return (int) arr.stream()
//                .filter(e -> e.matches("[:;][-~]?[\\)D]"))
//                .count();

        return (int) arr.stream().filter(s -> s.matches("^[:;][-~]?[)D]$")).count();


    }
}
