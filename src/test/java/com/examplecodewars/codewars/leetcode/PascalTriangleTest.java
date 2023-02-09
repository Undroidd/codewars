package com.examplecodewars.codewars.leetcode;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PascalTriangleTest extends TestCase {

    public void testGenerate() {
        List<List<Integer>> expected = new ArrayList<>();



        List<List<Integer>> result = PascalTriangle.generate(5);
        assertEquals(result.size(), 5);
        assertEquals(result.get(0).size(), 1);
//        assertEquals(result, is());

    }
}