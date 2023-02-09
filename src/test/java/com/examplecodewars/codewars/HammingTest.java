package com.examplecodewars.codewars;

import org.junit.*;
import static org.junit.Assert.*;

public class HammingTest {
    @Test
    public void Test1() {
        Assert.assertEquals("hamming(1) should be 1", 1, Hamming.hamming(1));
        Assert.assertEquals("hamming(2) should be 2", 2, Hamming.hamming(2));
        Assert.assertEquals("hamming(3) should be 3", 3, Hamming.hamming(3));
        Assert.assertEquals("hamming(4) should be 4", 4, Hamming.hamming(4));
        Assert.assertEquals("hamming(5) should be 5", 5, Hamming.hamming(5));
        Assert.assertEquals("hamming(6) should be 6", 6, Hamming.hamming(6));
        Assert.assertEquals("hamming(7) should be 8", 8, Hamming.hamming(7));
        Assert.assertEquals("hamming(8) should be 9", 9, Hamming.hamming(8));
        Assert.assertEquals("hamming(9) should be 10", 10, Hamming.hamming(9));
        Assert.assertEquals("hamming(10) should be 12", 12, Hamming.hamming(10));
        Assert.assertEquals("hamming(11) should be 15", 15, Hamming.hamming(11));
        Assert.assertEquals("hamming(12) should be 16", 16, Hamming.hamming(12));
        Assert.assertEquals("hamming(13) should be 18", 18, Hamming.hamming(13));
        Assert.assertEquals("hamming(14) should be 20", 20, Hamming.hamming(14));
        Assert.assertEquals("hamming(15) should be 24", 24, Hamming.hamming(15));
        Assert.assertEquals("hamming(16) should be 25", 25, Hamming.hamming(16));
        Assert.assertEquals("hamming(17) should be 27", 27, Hamming.hamming(17));
        Assert.assertEquals("hamming(18) should be 30", 30, Hamming.hamming(18));
        Assert.assertEquals("hamming(19) should be 32", 32, Hamming.hamming(19));
    }

    @Test
    public void Test2() {
        Hamming.testme();
    }

    @Test
    public void Test3() {
        final int ITERATION = 100_000;
        String s = "";

        // String Concatenation using + operator
        long startTime = System.nanoTime();
//        for (int i = 0; i < ITERATION; i++) {
//            s = s + Integer.toString(i);
//        }
        s = "ceva" + " " + "altceva";
        long duration = (System.nanoTime() - startTime) / 1000;
        System.out.println("Time taken to concatenate 100000 Strings using + operator (in micro) : " + duration);


//         long startTime = System.nanoTime();
////        for (int i = 0; i < ITERATION; i++) {
////            s = s + Integer.toString(i);
////        }
//       StringBuilder fg = new StringBuilder("ceva");
//        fg.append(" ");
//        fg.append("altceva");
//        fg.toString();
//        long duration = (System.nanoTime() - startTime) / 1000;
//        System.out.println("Time taken to concatenate 100000 Strings using + operator (in micro2) : " + duration);

//        s = "";
//        // Using String concat() method
//        startTime = System.nanoTime();
//        for (int i = 0; i < ITERATION; i++) {
//            s = s.concat(Integer.toString(i));
//
//
//        }
//        s = "";
//        duration = (System.nanoTime() - startTime) / 1000;
//        System.out.println("Time taken to concatenate 100000 Strings using concat method (in micro) : " + duration);
//
//        // StringBuffer example to concate String in Java
//        StringBuffer buffer = new StringBuffer(); // default size 16
//        startTime = System.nanoTime();
//        for (int i = 0; i < ITERATION; i++) {
//            buffer.append(i);
//
//        }
//        buffer.toString();
//        s = "";
//        duration = (System.nanoTime() - startTime) / 1000;
//        System.out.println("Time taken to concatenate 100000 Strings using StringBuffer (in micro) : " + duration);
//
//        // StringBuilder example to concate two String in Java
//        StringBuilder builder = new StringBuilder(); //default size for worst case
//        startTime = System.nanoTime();
//        for (int i = 0; i < ITERATION; i++) {
//            builder.append(i);
//
//        }
//        builder.toString();
//        duration = (System.nanoTime() - startTime) / 1000;
//        System.out.println("Time taken to concatenate 100000 Strings using StringBuilder append in micro) : " + duration);
    }
}
