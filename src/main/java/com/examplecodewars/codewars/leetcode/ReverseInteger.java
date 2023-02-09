package com.examplecodewars.codewars.leetcode;

import java.util.Stack;

public class ReverseInteger {
    public static int reverse(int x) {

//        String g = x + "";
//        try {
//            StringBuilder s = new StringBuilder(x+"");
//            String xe = "";
//            if(s.indexOf("-") == 0) {
//                s.delete(0, 1);
//                xe = "-";
//            }
//            return new Integer(xe + s.reverse().toString());
//        } catch (Exception ex){
//            return 0;
//        }

//        int f = x;
//
//        int result = 0;
//        try {
//            StringBuilder s = new StringBuilder();
//            boolean once = false;
//            while(x != 0) {
//                int c = x % 10;
//                if(once && f < 0) {
//                    c = c * -1;
//                }
//
//
//                x = x / 10;
//                if (c != 0 || once) {
////                    s.append(c);
//                    result = result * 10 + c;
//                }
//
//                if(c != 0) {
//
//                    once = true;
//                }
//
//            }
//
//            return  new Integer(result);
//        } catch (Exception ex){
//            return 0;
//        }


//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;


        int result = 0;
        try {
            boolean once = false;
            while(x != 0) {
                int c = x % 10;
                x = x / 10;

                result = result * 10 + c;
            }

            return  new Integer(result);
        } catch (Exception ex){
            return 0;
        }

//        Stack<Integer> myStack = new Stack<>();
//
//        for(int )
//        myStack.push();
//
//        myStack.pop();
    }
}
