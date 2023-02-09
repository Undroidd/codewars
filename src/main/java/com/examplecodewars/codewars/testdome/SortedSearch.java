package com.examplecodewars.codewars.testdome;

import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        final int element = Arrays.binarySearch(sortedArray, lessThan);

        if(element >= 0) {
            return element;
        } else {
            return (element + 1) * (-1);
        }
    }

    public static int countNumbers2(int[] sortedArray, int lessThan) {
        int result = 0;
       for(int i : sortedArray) {
           if(i >= lessThan) {
               return result;
           } else {
               result++;
           }
       }

       return result;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1 }, 1));
    }
}
