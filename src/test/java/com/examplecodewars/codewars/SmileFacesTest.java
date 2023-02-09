package com.examplecodewars.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SmileFacesTest {

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
//        List<String> a =  new ArrayList<String>();
//        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        List<String> a = Arrays.asList(";D",
                "oD)",
                "5dD",
                ";-D",
                "8oD",
                "8-X",
                "4~d",
                "8)",
        "pp)",
        "p5p))",
        ":~))",
        "8~d",
        ":d",
                "8:o)",
        "o'p",
        "4-)",
        "5D",
        "p)",
        "5)",
        "o~)",
        "4~p" +
                ":oD" ,
                ";pD" ,
                "4x8DD" ,
                ";8P",
                ":-)" ,
                "pD" ,
                ";D" ,
                "()",
                "4-X" ,
                ":~)" ,
                ";D)",
                "5-)",
                "p-p"
                );
        assertEquals(5, SmileFaces.countSmileys(a));
    }
}



