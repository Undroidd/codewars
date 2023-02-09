package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {


        int x =    123;
        StringBuilder s = new StringBuilder();
        while(x % 10 > 0) {

            int c = x % 10;
            s.append(c);
            x = x / 10;
        }
//
//        assertEquals(ReverseInteger.reverse(555), 555);
        assertEquals(ReverseInteger.reverse(123), 321);
        assertEquals(ReverseInteger.reverse(-123), -321);
        assertEquals(ReverseInteger.reverse(120), 21);
        assertEquals(ReverseInteger.reverse(-10), -1); //1534236469
        assertEquals(ReverseInteger.reverse(-10), -1);
    }
}
