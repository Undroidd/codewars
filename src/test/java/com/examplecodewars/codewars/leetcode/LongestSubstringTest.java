package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg(" "), 1);
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg("abcabcbb"), 3);
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg("bbbbb"), 1);
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg("pwwkew"), 3);
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg("aab"), 2);
        assertEquals(LongestSubstring.lengthOfLongestSubstringgdg("dvdf"), 3);
    }
}
