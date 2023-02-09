package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringtoIntegerTest {

    @Test
    public void myAtoi() {

        assertEquals(StringtoInteger.myAtoi( "   -42"), -42);
        assertEquals(StringtoInteger.myAtoi( "3.14159"), 3);
        assertEquals(StringtoInteger.myAtoi( ".1"), 0);
        assertEquals(StringtoInteger.myAtoi(  "-+1"), 0);
        assertEquals(StringtoInteger.myAtoi(    " b11228552307"), 0);

    }
}
