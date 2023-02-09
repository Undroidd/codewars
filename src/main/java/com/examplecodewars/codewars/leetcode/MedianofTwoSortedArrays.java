package com.examplecodewars.codewars.leetcode;

/**
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int middle = nums1.length/2;
        double medianValue1 = 0; //declare variable
        if (nums1.length%2 == 1)
            medianValue1 = nums1[middle];
        else
            medianValue1 = (nums1[middle-1] + nums1[middle]) / 2.0;

        int middle2 = nums2.length/2;
        double medianValue2 = 0; //declare variable
        if (nums2.length%2 == 1)
            medianValue2 = nums2[middle2];
        else
            medianValue2 = (nums2[middle2-1] + nums2[middle2]) / 2;


        return medianValue2 > medianValue1 ? medianValue2 : medianValue1;
    }
}
