package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {


    @Test
    public void lengthOfLIS() {
//        assertEquals(LongestIncreasingSubsequence.lengthOfLIS2(new int[] {
//                10,9,2,5,3,7,101,18
//        }), 4);

//        assertEquals(LongestIncreasingSubsequence.lengthOfLIS3(new int[] {
//                1,3,6,7,9,4,10,5,6
//        }), 6);
//
//        assertEquals(LongestIncreasingSubsequence.lengthOfLIS2(new int[] {
//                -2,-1
//        }), 2);

        assertEquals(LongestIncreasingSubsequence.ll(new int[] {
                10,9,2,5,3,4
        }), 3);
    }
}
