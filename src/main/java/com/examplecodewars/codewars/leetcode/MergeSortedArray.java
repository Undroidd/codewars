package com.examplecodewars.codewars.leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0, j = 0;
        int result [] = new int[m + n];
        if (n == 0) {
            result = nums1;
        } else if (m == 0 ) {
            result = nums2;
        } else {

            int i = 0;
            while (k < m && j < n) {
                if (nums1[k] != 0 ) {
                    if (nums1[k] < nums2[j]) {
                        result[i] = nums1[k];
                        k++;
                    } else if (nums1[k] == nums2[j]) {
                        result[i] = nums1[k];
                        result[i + 1] = nums2[j];
                        k++;
                        j++;
                        i++;
                    } else {
                        result[i] = nums2[j];
                        j++;
                    }
                } else {
                    result[i] = nums2[j];
                    j++;
                    k++;
                }
                i++;
            }

            if (n < m) {
                for ( i = n + 1; i < m; i++ ) {
                    result[i] = nums1[i];
                }
            } else if (m < n) {
                for ( i = m + 1; i < n; i++ ) {
                    result[i] = nums2[i];
                }
            }

//            for (int i = 0; i < m + n; i++) {
//                if (nums1[k] != 0 ) {
//                    if (nums1[k] < nums2[j]) {
//                        result[i] = nums1[k];
//                        k++;
//                    } else if (nums1[k] == nums2[j]) {
//                        result[i] = nums1[k];
//                        result[i + 1] = nums2[j];
//                        k++;
//                        j++;
//                        i++;
//                    } else {
//                        result[i] = nums2[j];
//                        j++;
//                    }
//                } else {
//                    result[i] = nums2[j];
//                    j++;
//                    k++;
//                }
//
//            }
        }
        for(int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }

    public void mergebun(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1, j = m - 1, k = n - 1;
        while (j >= 0 && k >= 0) nums1[i--] = (nums1[j] > nums2[k]) ? nums1[j--] : nums2[k--];
        while (k >= 0) nums1[i--] = nums2[k--];
    }
}
