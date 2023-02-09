package com.examplecodewars.codewars.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int currentLength = 0;
        List<Character> longestList = new ArrayList<>();
        Set<Character> distinct = new HashSet<>();
        for (char c : s.toCharArray()) {
            if(distinct.add(c)){
                currentLength++;
            }
            else {

                longestList =  longestList.subList(longestList.indexOf(c) + 1, longestList.size());
                currentLength = longestList.size() + 1;

            }
            longestList.add(c);
            if(currentLength > result) {
                result = currentLength;
            }

        }


        return result;
    }


    public static int lengthOfLongestSubstringgg(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstringgdg(String s) {

        final int length = s.length();
        Set<Character> distinct = new HashSet<>();
        int result = 0, i = 0, j = 0;

        while (i < length && j < length) {
            if (!distinct.contains(s.charAt(j))){
                distinct.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else {
                distinct.remove(s.charAt(i++));
            }
        }

//        max: for(int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (distinct.add(s.charAt(j))){
//                    int sum = j + 1;
//                    result = Math.max(result, sum - i);
//                } else {
//                    distinct.remove(s.charAt(i));
//                    continue max;
//                }
//            }
//        }
//
        return result;

    }

    public static int lengthOfLongestSubstringg(String s) {
        final char[] chars = s.toCharArray();
        int result = 0;
        int currentLength = 0;
        int index  = 0;

//        max: for(int i = 0; i < chars.length - 1; i++) {
//            for(int j = i + 1; j < chars.length; j++){
//                if(chars[i] == chars[j]) {
//                    if(result < j -i)
//                        result = j - i;
////                    index = j;
//
//                    continue max;
////                    break;
//                }
//                if(j == chars.length - 1 && result <= j -i) {
//                    result = chars.length - i;
//                }
//            }
//        }
//        assertEquals(LongestSubstring.lengthOfLongestSubstringg("pwwkew"), 3);
        Set<Character> distinct = new HashSet<>();
        for(int i = 0; i < chars.length; i++) {
            final char aChar = chars[i];
            if(distinct.add(aChar)) {
                currentLength++;
            } else {
                currentLength = 1;
                distinct.remove(aChar);
                distinct.clear();
                distinct.removeIf(character -> character.equals(aChar));
                distinct.add(aChar);
            }

            if(result < currentLength) {
                result = currentLength;
            }
        }

//        if (result < chars.length - index) {
//            result = chars.length - index;
//        }


//        List<Character> longestList = new ArrayList<>();
//        for (char c : s.toCharArray()) {
//            if(!longestList.contains(c)){
//                currentLength++;
//            }
//            else {
//
//                longestList =  longestList.subList(longestList.indexOf(c) + 1, longestList.size());
//                currentLength = longestList.size() + 1;
//
//            }
//            longestList.add(c);
//            if(currentLength > result) {
//                result = currentLength;
//            }
//
//        }


        return result;
    }


}
