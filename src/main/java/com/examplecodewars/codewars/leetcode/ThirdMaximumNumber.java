package com.examplecodewars.codewars.leetcode;

public class ThirdMaximumNumber {

    /**
     * Runtime: 1 ms, faster than 89.32% of Java online submissions for Third Maximum Number.
     * Memory Usage: 39.9 MB, less than 9.27% of Java online submissions for Third Maximum Number.
     * Next challenges:
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Third Maximum Number.
     * Memory Usage: 38.9 MB, less than 40.13% of Java online submissions for Third Maximum Number.
     * @param nums
     * @return
     */
    public static int thirdMax(int[] nums) {
        long maximum = Long.MIN_VALUE;
        long secondmaximum = Long.MIN_VALUE;
        long thirdmaximum = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if (maximum < nums[i]) {
                thirdmaximum = secondmaximum == Long.MIN_VALUE ? thirdmaximum : secondmaximum;;
                secondmaximum = maximum == Long.MIN_VALUE ? secondmaximum : maximum;;
                maximum = nums[i];

            }  else if (secondmaximum < nums[i] && nums[i] < maximum) {
                thirdmaximum = secondmaximum == Long.MIN_VALUE ? thirdmaximum : secondmaximum;;
                secondmaximum = nums[i];
            }  else if (thirdmaximum < nums[i] && nums[i] < secondmaximum) {
                thirdmaximum = nums[i];
            }
        }
        return thirdmaximum !=  Long.MIN_VALUE ? (int) thirdmaximum : (int) maximum;
    }
}
