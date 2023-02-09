package com.examplecodewars.codewars.leetcode;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; temp *= nums[i],  i++ ) {
            result[i] = temp;
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            result[i] = result[i] * temp;
            temp *= nums[i];
        }
        return result;
    }
}


//[1,2,3,4] -> temp = 1; result[0] = 1; temp = 1 * 1;
//result[1] = 1; temp = 1 * 2;
//restult[2] = 2; temp = 2 * 3 = 6
//result[3] = 6; temp = 6 * 4 = 24
//
//
//result[3] = 6 * 1 temp = 4
//result[2] = 2 * 4 = 8; temp = 12
//result[1] = 1 * 12 = 12 temp = 24
//result[0] = 24