package com.examplecodewars.codewars.algos.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void factorial() {
        assertEquals(Recursion.factorial(4), 24);

    }

    @Test
    public void fibonaci() {
        assertEquals(Recursion.fibonaci(3), 2);
        assertEquals(Recursion.fibonaci(4), 3);
        assertEquals(Recursion.fibonaci(5), 5);
        assertEquals(Recursion.fibonaci(6), 8);

    }
}
