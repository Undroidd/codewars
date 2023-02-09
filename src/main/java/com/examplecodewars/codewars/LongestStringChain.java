package com.examplecodewars.codewars;

import org.checkerframework.common.value.qual.ArrayLenRange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestStringChain {

//    public int longestStringChain(List<String> words) {
//
//        //1
//        for(int i = -1; i < words.size()-1; i++) {
//            for(a->z) {
//                s = A[]
//            }
//        }
//
//        //2
//        for(int i = -1; i < words.size()-1; i++) {
//                s = B[0.. pos-1] + B[pos+1..]
//                if(s == A) match
//
//        }
//    }



//    public int longestStringChain(String[] words) {
//        int n = words.length;
//
//        List<List<Integer>> edges = new ArrayList<>();
//
//        Map<String, Integer> hisPosition = new HashMap<>(); //a-> 1; ab-> 2; c-> 3
//
//        for(int i = 0; i < n; i++) {
//            hisPosition.put(words[i], i);
//        }
//
//        for(int i = 0; i < n; i++) {
//            String s = words[i];
//            for(int j = 0; j < (int) s.length(); j++) {
//                //remove s[j]
//                // bcda -> bca (maybe)
//                String maybe = s.substring(0, j) + s.substring(j+1);
//                final Integer exits = hisPosition.get(maybe);
//                if(exits == null) {
//                    continue;
//                }
//            }
////            edges.get().push(i);
//        }
//
//        int answear = 0;
//
//        for(int i=0; i< n; i++) {
//            answear = max(answear, longest(i));
//        }
//        return answear;
//    }
//
//    int longest(int v) {
//
//    }
}
