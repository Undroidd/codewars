package com.examplecodewars.codewars.leetcode;


public class PalindromeNumber {
    /**
     * @param x
     *   assertEquals(PalindromeNumber.isPalindrome(123), false);
     *         assertEquals(PalindromeNumber.isPalindrome(-123), false);
     *         assertEquals(PalindromeNumber.isPalindrome(121), true);
     *         assertEquals(PalindromeNumber.isPalindrome(10), false);
     * @return
     */
    public static boolean isPalindrome(int x) {
        int pastrat = x;
        int result = 0;
        while(x > 0) {
            int numar = x % 10;
            result = result * 10 + numar;
            x /= 10;
        }
        return result == pastrat;
    }
}
