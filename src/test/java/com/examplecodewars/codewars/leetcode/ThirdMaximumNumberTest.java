package com.examplecodewars.codewars.leetcode;

import junit.framework.TestCase;

public class ThirdMaximumNumberTest extends TestCase {

    public void testThirdMax() {
        int result = ThirdMaximumNumber.thirdMax(new int[]{1, 2, -2147483648});

        assertEquals(result, -2147483648);
    }
}