package com.examplecodewars.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {

//        String pattern = "(\n)(\\s+)([\\" + symb + "])";
//        String pat = "(?s)" + symb + ".*?\n";
//        String pat2 = "(?s)!.*?\n";

        String result = text.replaceAll("/(\\s\\W\\w+).*|(\\s\\W\\s?\\w+\\s?\\w+)/g", "");

        final char[] chars = text.toCharArray();


        String symb = "";
        for (String commentSymbol : commentSymbols) {
            symb += commentSymbol;
        }

        StringBuilder ss = new StringBuilder();

        String g = "\n";

        boolean isComment = false;

        for (int i = 0; i <  chars.length; i++) {
            if (symb.indexOf(chars[i]) != -1) {
                isComment = true;
            } else if (g.indexOf(chars[i]) == 0) {
                isComment = false;
                ss.append(chars[i]);
            } else if (!isComment && symb.indexOf(chars[i+1]) == -1) {
                ss.append(chars[i]);
            }
        }

        return ss.toString().trim();
    }

    public static String stripComment2s(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        // escape the comment symbols so that they can be used as regex
        List<String> escapedCommentSymbols = Arrays.stream(commentSymbols).map(Pattern::quote).collect(Collectors.toList());
        for(int i = 0 ; i < lines.length ; i++) {
            // create a regex that matches the comment portion of a line
            String regex = "(" + String.join("|", escapedCommentSymbols) + ").+$";
            lines[i] = lines[i].replaceAll(regex, "");
            // replace trailing whitespace even if it is not a comment.
            lines[i] = lines[i].replaceAll("\\s+$", "");
        }
        return String.join("\n", (CharSequence[]) lines);
    }

}
