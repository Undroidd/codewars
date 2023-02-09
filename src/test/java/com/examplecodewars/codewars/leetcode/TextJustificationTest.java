package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextJustificationTest {

//    "This  is an"
//            "justification.   "
//    "example       of      text"
//"justification.  "
//    "This    is   an"
    @Test
    public void fullJustify() {
        String [] data = new String[] {"This", "is", "an", "example", "of", "text", "justification."};


//        String [] data = new String[] {"What", "must", "be", "acknoledgment", "shall", "be"};


//        String [] data = new String[] {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};

        TextJustification.fullJustify( data, 16);
//        assertEquals(TextJustification.fullJustify( data, 16));
    }
}
