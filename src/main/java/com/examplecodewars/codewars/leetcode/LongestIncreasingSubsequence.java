package com.examplecodewars.codewars.leetcode;

import java.util.Arrays;

/**
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */
public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        if(nums.length < 1) {
            return 0;
        }
        int current = 1;
        int max = 1;
        int currentValue = 0;

        for(int i = 0; i < nums.length; i++) {
            current = 1;
            currentValue = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] > currentValue) {
                    current++;
                    currentValue = nums[j];
                }

                if(current > max) {
                    max = current;
                }
            }
        }
        return max;
    }


    public static int lengthOfLIS2(int[] nums) {
        if(nums.length < 1) {
            return 0;
        }
        int current = 1;
        int max = 1;
        int currentValue = Integer.MAX_VALUE;

        for(int i = nums.length-1; i > 0; i--) {
            current = 1;
            currentValue = nums[i];
            for(int j = i - 1; j > -1; j--) {
                if(nums[j] < currentValue) {
                    current++;
                    currentValue = nums[j];
                }

                if(current > max) {
                    max = current;
                }
            }
        }
        return max;
    }

    public static int ll(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }


    public static int lengthOfLIS4(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int len = 0;
        // [2,5,3,4]
        // 2 5 len = 2  2 3 5 index != len len = 2
        for(int num : nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);

            if(index < 0) {
                index = -(index + 1);
            }
            dp[index] = num;

            if(index == len) {
                len++;
            }


        }  return len;

    }


    public static int lengthOfLIS3(int[] nums) {
        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    }


    // [2,5,3,4]
    public static int lengthofLIS(int[] nums, int prev, int curpos) {
        if (curpos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curpos] > prev) {
            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
        }
        int nottaken = lengthofLIS(nums, prev, curpos + 1);
        return Math.max(taken, nottaken);
    }
}
