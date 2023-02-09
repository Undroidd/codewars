package com.examplecodewars.codewars.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextJustification {
//    This    is    an
//    "This    is    an",
//      "This    is   an"
//    "example      of     text"
    // example      of     text
//    "example  of text"

//    ["Science  is  what we","understand      well","enough to explain to","a  computer.  Art is","everything  else  we","do                  "]
//    ["Science  is what we","understand      well","enough to explain to","a  computer. Art is","everything  else  we","do                  "]


//    ["This    is    an    ","example of text","justification.  "]
//    ["This    is    an","example  of text","justification.  "]

//    ["This    is    an","example  of text","justification.  "]
//    ["This    is    an","example  of text","justification.  "]
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new LinkedList<>();

        int currentLength = 0;

        List<String> currentStrings = new LinkedList<>();
        int currentWordsCount = 0;

        for(int j = 0; j < words.length; j++) {

            currentLength += words[j].length();



            if(currentLength >  maxWidth) {
                StringBuilder str = new StringBuilder();
//                currentWordsCount--;
                int spacesToAdd = maxWidth - (currentLength - words[j].length()) + currentWordsCount;
//                currentWordsCount--;
                if(currentWordsCount > 1) {
                    int spacesLeft = spacesToAdd % (currentWordsCount - 1) == 0 ? spacesToAdd / (currentWordsCount -1) : spacesToAdd / (currentWordsCount-1) + 1;
                    int spacesRight = spacesToAdd % (currentWordsCount - 1) == 0 ? spacesLeft : spacesLeft - 1;
                    int countspace = 0;
                    boolean isLeft = true;
                    for(int k = 0; k < currentStrings.size(); k++) {
                        str.append(currentStrings.get(k));
                        if(isLeft) {
                            for(int i = 0; i < spacesLeft; i++) {
                                str.append(" ");
                            }
                            countspace++;
                            final int er = spacesToAdd % (currentWordsCount - 1);
                            if(spacesToAdd % (currentWordsCount - 1) == 0 || countspace == er) {
                                isLeft = false;
                            }

                        } else if (k != currentStrings.size() - 1){
                            for(int i = 0; i < spacesRight; i++) {
                                str.append(" ");
                            }
                        }
                    }
                }  else {
                    str.append(currentStrings.get(0));
                    for(int i = 0; i < spacesToAdd; i++) {
                        str.append(" ");
                    }
                }

//                String
                result.add(str.toString());
                currentLength = words[j].length();
                currentStrings.clear();
                currentWordsCount = 0;
            }
            if (j == words.length - 1) {
                StringBuilder str = new StringBuilder();
                for(String s : currentStrings) {
                    str.append(s);
                    str.append(" ");
                }

                str.append(words[j]);

                int leftToAppend = maxWidth - str.length();
                for(int i = 0; i < leftToAppend; i++) {
                    str.append(" ");
                }

                result.add(str.toString());
                currentStrings.clear();
                currentWordsCount = 0;
                currentLength = words[j].length();
            }
//            else {
            currentWordsCount++;
                currentStrings.add(words[j]);
//                str.append(word);
//                str.append(" ");
//            }
            currentLength++;
        }

        return result;
    }
}
