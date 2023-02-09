package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convert() {
        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 1), "PAYPALISHIRING");
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 2), "PYAIHRNAPLSIIG");
//        assertEquals(ZigZagConversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
    }
}
