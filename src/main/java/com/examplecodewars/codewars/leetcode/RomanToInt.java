package com.examplecodewars.codewars.leetcode;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 */
public class RomanToInt {

    private static TreeMap<String, Integer> MAP;
    static {
        MAP = new TreeMap<>(Collections.reverseOrder());
        MAP.put( "I", 1);
        MAP.put( "IV", 4);
        MAP.put( "V" , 5);
        MAP.put( "IX", 9 );
        MAP.put( "X", 10  );
        MAP.put( "XL", 40 );
        MAP.put( "L", 50 );
        MAP.put( "XC", 90 );
        MAP.put( "C", 100 );
        MAP.put( "CD", 400 );
        MAP.put( "D", 500 );
        MAP.put( "CM", 900 );
        MAP.put( "M", 1000 );
    }

    public static int romanToInt(String s) {
        int result = 0;

        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String key = chars[i] + "";
            if(i < chars.length - 1) {
                String intkey = key + "" + chars[i+1];
                if(MAP.containsKey(intkey)) {
                    result += MAP.get(intkey);
                    i++;
                } else {
                    result += MAP.get(key);
                }
            } else {
                result += MAP.get(key);
            }
        }
        return result;
    }
}
