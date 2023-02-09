package com.examplecodewars.codewars.leetcode;

public class FindMinimumRotatedSortedArray {
//    public int findMin(int[] nums) {
//        int low = 0, high = nums.length - 1;
//
//        [10, 12, 13, 4, 9];
//        low = 0; high = 4;
//
//        pivot = 0 + 2;
//
//        4 < 9 da high = 2
//
//         0 < 2
//         pivot = 0 + 1
//
//         12 < 4 nu low = 2
//
//        while (low < high) {
//            int pivot = low + (high - low) / 2;
//            if (nums[pivot] < nums[high])
//                high = pivot;
//            else if (nums[pivot] > nums[high])
//                low = pivot + 1;
//            else
//                high -= 1;
//        }
//        return nums[low];
//    }
}
