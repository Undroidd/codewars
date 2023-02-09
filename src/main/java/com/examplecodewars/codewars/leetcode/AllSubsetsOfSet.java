package com.examplecodewars.codewars.leetcode;

import com.google.common.collect.Lists;

import java.util.Arrays;

public class AllSubsetsOfSet {

    public static void allsubsets(int[] nums) {
        int[] subsets = new int[nums.length];
        helper(nums, subsets, 0);
    }

    private static void helper(int[] nums, int[] subset, int index) {
        if(index == nums.length) {
            System.out.println(subset.length);
        } else {
            subset[index] = 0;
            helper(nums, subset, index + 1);
            subset[index] = nums[index];
            helper(nums, subset, index + 1);
        }
    }
}
