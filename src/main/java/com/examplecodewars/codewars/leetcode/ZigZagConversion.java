package com.examplecodewars.codewars.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * PAYPALISHIRING 3
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * PAHNAPLSIIGYIR
 *
 * PAYPALISHIRING 4
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 *  PAYPALISHIRING 5
 *  P       H
 *  A     S I
 *  Y   I   R
 *  P  L    I  G
 *  A       N
 *
 * PINALSIGYAHRPI
 *
 * PAYPALISHIRING 1
 *
 * PAYPALISHIRING
 *
 * PAYPALISHIRING 2
 *
 * PYAIHRN
 * APLSIIG
 *
 * PYAIHRNAPLSIIG
 */
public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        Map<Integer, StringBuilder> rowString = new HashMap<>();

        boolean goingDown = false;
        int currentRow = 0;

        for (char c : s.toCharArray()) {
            rowString.computeIfPresent(currentRow, (k, v) -> v.append(c));
            rowString.putIfAbsent(currentRow, new StringBuilder(c + ""));
            if (currentRow == 0 || currentRow == numRows - 1) goingDown = !goingDown;
            currentRow = currentRow + (goingDown ? 1 : -1);
        }

//        final String result = String.join("", rowString.values());

//        for(int i = 0; i < s.length()%numRows; i++) {
//            if(numRows > 1) {
//                result += convert(s.substring(1, numRows - 1), numRows - 1);
//            } else {
//                return s;
//            }
//        }

        return String.join("", rowString.values());
    }


//    public static String convertString() {
//
//    }}

//mai rapid
    public String converte(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}

