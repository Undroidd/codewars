package com.examplecodewars.codewars;

import java.util.HashMap;
import java.util.Map;

public class ParseMolecule {

    public static Map<String,Integer> getAtoms(String formula) {
        // Your code here!
        HashMap<String,Integer>  atoms = new HashMap<String,Integer>();

        for(char ch : formula.toCharArray()) {

            String key = "";
            if(Character.isLetter(ch)) {
                key = ch+"";
            }

            Integer value = 0;

            if(!atoms.containsKey(key)) {
                atoms.put(key, value);
            }
            else {
                Integer currentValue = atoms.get(key);
                currentValue += atoms.get(key) + value;
            }
        }


        return atoms;
    }

//    private boolean isNumber(char c) {
//
//    }
//
//    private boolean isLetter(char c) {
//
//    }

    private boolean isParenthesis(char c) {
        return false;
    }
}
