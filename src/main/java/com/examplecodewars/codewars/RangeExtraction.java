package com.examplecodewars.codewars;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {

    //  assertEquals("-3--1,2,10,15,16,18-20", RangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
//        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
    //  assertEquals("1 2", RangeExtraction.rangeExtraction(new int[] {1-2}));
    public static String rangeExtractione(int[] arr) {
        StringBuilder result = new StringBuilder();

        StringBuilder currentString = new StringBuilder();
        String curent = "";

        for(int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i + 1] == arr[i] + 1) {
                if(curent.length() == 0) {
                    curent += arr[i] + "-";
                    currentString.append(arr[i]);
                    currentString.append("-");
                }
                continue;
            } else {
                currentString.append(arr[i]);
                curent += arr[i];
                result.append(curent);
                if (i != arr.length-1) {
                    result.append(",");
                }
                curent = "";
                currentString.delete(0, currentString.length()-1);
            }
        }
        return result.toString();
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        List<Integer> inordine = new ArrayList<>();


        for(int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i + 1] == arr[i] + 1) {
                inordine.add(arr[i]);
            } else {
                if(inordine.size() > 1) {
                    result.append(inordine.get(0));
                    result.append("-");
                } else {
                    inordine.forEach(ord -> result.append(ord).append(","));
                }

                result.append(arr[i]);
                if (i != arr.length-1) {
                    result.append(",");
                }
                inordine.clear();
            }
        }
        return result.toString();
    }
}
