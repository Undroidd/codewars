package com.examplecodewars.codewars;

import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanConversion {
//    public String solution(int n) {
//        String romanNumber = "";
//        TreeMap<Integer, String> mappingNumbers = ImmutableTreeMap.<Integer, String>builder()
//                .put(1, "I")
//                .put(5, "V")
//                .put(10, "X")
//                .put(50, "L")
//                .put(100, "C")
//                .put(500, "D")
//                .put(1000, "M")
//                .build();

//         TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//
//
//
//            map.put(1000, "M");
//            map.put(900, "CM");
//            map.put(500, "D");
//            map.put(400, "CD");
//            map.put(100, "C");
//            map.put(90, "XC");
//            map.put(50, "L");
//            map.put(40, "XL");
//            map.put(10, "X");
//            map.put(9, "IX");
//            map.put(5, "V");
//            map.put(4, "IV");
//            map.put(1, "I");
//
//
//
//        int l =  map.floorKey(n);
//        if ( n == l ) {
//            return map.get(n);
//        }
//        return map.get(l) + toRoman(number-l);
//
//        return romanNumber;
//    }

    private static TreeMap<Integer, String> MAP;
    static {
        MAP = new TreeMap<>(Collections.reverseOrder());
        MAP.put( 1, "I" );
        MAP.put( 4, "IV" );
        MAP.put( 5, "V" );
        MAP.put( 9, "IX" );
        MAP.put( 10, "X" );
        MAP.put( 40, "XL" );
        MAP.put( 50, "L" );
        MAP.put( 90, "XC" );
        MAP.put( 100, "C" );
        MAP.put( 400, "CD" );
        MAP.put( 500, "D" );
        MAP.put( 900, "CM" );
        MAP.put( 1000, "M" );
    }

    public String solution(int n) {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Integer, String> entry: MAP.entrySet() ){
            int i = entry.getKey();
            String s = entry.getValue();
            while( n>=i ){
                builder.append(s);
                n -= i;
            }
        }
        return builder.toString();
    }


    public enum Symbol {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        int value;

        Symbol(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }
    }
}
