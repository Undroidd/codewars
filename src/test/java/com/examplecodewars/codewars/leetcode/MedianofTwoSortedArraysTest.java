package com.examplecodewars.codewars.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.*;

public class MedianofTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        Assert.assertThat(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {0, 3}, new int[] {2}), comparesEqualTo(2.0));
        Assert.assertThat(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), comparesEqualTo(2.5));
        Assert.assertThat(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4}), comparesEqualTo(2.5));


//        assertEquals(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {0, 3}, new int[] {2}), 2.0);
//        assertEquals(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), 2.5);
//        assertEquals(MedianofTwoSortedArrays.findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4}), 2.5);
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 1), "PAYPALISHIRING");
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 2), "PYAIHRNAPLSIIG");
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");

    }
}
