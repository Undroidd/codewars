package com.examplecodewars.codewars.leetcode;

import junit.framework.TestCase;
import org.springframework.util.Assert;

public class IncreasingTripletSubsequenceTest extends TestCase {

    public void testIncreasingTriplet() {
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(new int[] {2,1,5,0,4,6}));
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(new int[] {12,1,5,0,4,6}));

    }
}