package com.examplecodewars.codewars;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] numbers, int target)
    {

        int firstIndex = 0;
        int lastIndex = numbers.length - 1;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = numbers.length-1; j >=0; j--) {
                if(numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    lastIndex = j;
                }
            }

        }

        int[] result = {firstIndex, lastIndex};

        return result; // Do your magic!
    }

    public static int[] twoSume(int[] numbers, int target) {
        Map<Integer, Integer> numToIndexMapping = new HashMap<>(numbers.length);
        for(int i = 0; i < numbers.length; i++) {
            if(numToIndexMapping.containsKey(target - numbers[i])) {
                return new int[] { i, numToIndexMapping.get(target - numbers[i]) };
            } else {
                numToIndexMapping.put(numbers[i], i);
            }
        }
        return new int[0];
    }
}
