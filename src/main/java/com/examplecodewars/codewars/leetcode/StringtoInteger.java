package com.examplecodewars.codewars.leetcode;

public class StringtoInteger {

    public static int myAtoie(String str) {
        if(str.length() == 0)
            return 0;

        int sign = 1;
        //forgot to convert string to char array
        char[] s = str.toCharArray();

        boolean started = false;
        boolean outOfBounds= false;

        int result = 0;
        for(char c : s){

            if( (c-'0') > 9 || (c-'0') < 0 && started )
                break;

            else if( c == '-' || c == '+' && !started){
                if(c =='-'){
                    sign = -1;
                    started = true;
                }
                else{
                    started = true;
                }

            }else if( (c-'0') >= 0 && (c - '0')<= 9){

                if(result > (Integer.MAX_VALUE - (c-'0') )/10){
                    outOfBounds = true;

                    break;
                }else{

                    result = ((result*10)+(c-'0'));

                }
                started = true;

            }
            else if (!started && c != ' ')
            {
                result = 0;
                break;
            }

        }

        if(outOfBounds){
            return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign*result;
    }

    public static int myAtoi(String str) {
        String minus = "-";
        String plus = "+";
        String point = ".";

        boolean isNegative = false;




        int result = 0;
        str = str.trim();

        if(str.length() == 0) {
            return 0;
        } else if(str.length() == 1 && Character.isDigit(str.charAt(0))) {
            if(str.charAt(0) == point.charAt(0)) {
                return 0;
            } else {
                return Integer.parseInt(str);
            }
        } else if(str.length() == 1 && !Character.isDigit(str.charAt(0))) {
            return 0;
        }

        if(str.charAt(0) == minus.charAt(0)) {
            isNegative = true;
        }

        // .1 +-1
        if(str.charAt(0) == point.charAt(0)) {
            return 0;
        }
        if((!Character.isDigit(str.charAt(0)) && (str.charAt(0) != minus.charAt(0) )) || !Character.isDigit(str.charAt(1))) {
            return 0;
        }



        StringBuilder resultString = new StringBuilder();

        boolean primaIteratie = true;
        for (char c : str.toCharArray()) {

            if(Character.isDigit(c)) {
                resultString.append(c);
//                result += (int)c + result;
//                result *= 10;
            } else if(!primaIteratie) {
                try {
                    result = Integer.parseInt(resultString.toString());
                } catch (Exception ex) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                return isNegative ? result * -1 : result;
            }
            primaIteratie = false;
        }

        try {
            result = Integer.parseInt(resultString.toString());
        } catch (Exception ex) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }


        return isNegative ? result * -1 : result;
    }
}
