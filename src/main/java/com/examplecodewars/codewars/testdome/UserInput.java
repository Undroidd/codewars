package com.examplecodewars.codewars.testdome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {

    public static class TextInput {
        List<String> inputs = new ArrayList<>();

        void add(char c) {
            inputs.add(c + "");
        }

        String getValue() {
            return inputs.stream().collect(Collectors.joining(""));

//            String.join("", inputs);
//            inputs.stream().collect(Jo)
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        void add(char c) {
            if(Character.isDigit(c)) {
                inputs.add(c + "");
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
