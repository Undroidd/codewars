package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {


    @Test
    public void palindrome() {



        assertEquals(PalindromeNumber.isPalindrome(123), false);
        assertEquals(PalindromeNumber.isPalindrome(-121), false);
        assertEquals(PalindromeNumber.isPalindrome(121), true);
        assertEquals(PalindromeNumber.isPalindrome(10), false);

    }
}
