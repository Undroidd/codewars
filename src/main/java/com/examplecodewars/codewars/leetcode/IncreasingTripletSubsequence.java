package com.examplecodewars.codewars.leetcode;

/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 * Example 2:
 *
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 * Example 3:
 *
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?
 */
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
//        int small1 =  nums[1];
//        int small2 =  Integer.MAX_VALUE;
//        int small3 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length-2; i++) {
            int small2 = nums[i+1];
            for(int j = i + 1; i < nums.length) {
                if(nums[i] < nums[j])
            }
        }
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < small1) {
//                small1 = nums[i];
//                small2 = small1;
//            }
//        }
        return false;
    }

    public boolean increasingTriplete(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        for (int num: nums) {
            if (num <= small) {
                small = num;// update x to be a smaller value
            } else if (num <= big) {
                big = num; // update y to be a smaller value
            } else {
                return true;
            }
        }

        return false;
    }
}
