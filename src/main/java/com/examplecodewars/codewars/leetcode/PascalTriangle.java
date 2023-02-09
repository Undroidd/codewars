package com.examplecodewars.codewars.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
        public static List<List<Integer>> generate(int numRows) {


            List<List<Integer>> result = new ArrayList<>();

            if (numRows == 0) {
                return result;
            }

            result.add(new ArrayList<>());
            result.get(0).add(1);

            for (int i = 1; i < numRows; i++) {
                List<Integer> rows = new ArrayList<>();
                rows.add(1);


                for(int j = 1; j < i; j++ ) {
//                    if (j == 0 || j == i || i < 2) {
//                        rows.add(1);
//                    } else {

//                    }
                    int value = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    rows.add(value);

                }

                rows.add(1);

                result.add(rows);
            }
            return result;
        }

}
