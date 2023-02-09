package com.examplecodewars.codewars.leetcode;

import junit.framework.TestCase;

public class MergeSortedArrayTest extends TestCase {

    public void testMerge() {
//        int [] myint = new int[] {1, 2, 3, 0, 0, 0};
//        MergeSortedArray.merge(myint, 3, new int[] {2, 5, 6}, 3);


        int [] myint = new int[] {2, 0};
        MergeSortedArray.merge(myint, 2, new int[] {1}, 1);

//        assertEquals(myint, new int[] {1,2,2,3,5,6});
        assertEquals(myint, new int[] {1});


    }
}