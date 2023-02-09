package com.examplecodewars.codewars.testdome;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {

        int[] result = new int[2];

        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] <= sum)
            for(int j = i + 1; j < list.length; j++ ) {
                if(list[i] + list[j] == sum) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] findTwoSum2(int[] list, int sum) {

        int[] result = new int[2];
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < list.length; ++i) {
            int temp = sum - list[i];

            // checking for condition
            if (s.containsKey(temp)) {
                result[0] = s.get(temp);
                result[1] = i;
                return result;
            }
            s.put(list[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum2(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
