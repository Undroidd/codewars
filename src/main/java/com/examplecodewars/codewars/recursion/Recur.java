package com.examplecodewars.codewars.recursion;

public class Recur {
    public static void main(String[] args){

    }

    static int factorial(int n){
        if (n <= 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
