package com.examplecodewars.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class StripCommentsTest {

    @Test
    public void stripComments() throws Exception {

        final String s = StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"});
String g = "apples, pears \ngrapes\nbananas";
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                s
        );

        assertEquals(
                "a\nc\nd",
                StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"})
        );

    }
}
