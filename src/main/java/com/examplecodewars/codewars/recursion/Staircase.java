package com.examplecodewars.codewars.recursion;

public class Staircase {

    // A recursive function used by countWays
//    static int countWaysUtil(int n, int m)
//    {
//        if (n <= 1)
//            return n;
//        int res = 0;
//        for (int i = 1; i<=m && i<=n; i++)
//            res += countWaysUtil(n-i, m);
//        return res;
//    }
//
//    // Returns number of ways to reach s'th stair
//    static int countWays(int s, int m)
//    {
//        return countWaysUtil(s+1, m);
//    }
//
//
//    /* Driver program to test above function */
//    public static void main (String args[])
//    {
//        int s = 4,m = 2;
//        System.out.println("Number of ways = "+ countWays(s,m));
//    }

    static int num_ways(int n) {
        if(n <= 1) {
            return 1;
        } else {
            int[] nums = new int[n+1];
            nums[0] = 1; nums[1] = 1;

            for(int i = 2; i <= n; i++) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
            return nums[n];
        }
    }

    static int num_ways2(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return num_ways(n-1) + num_ways(n-2);
        }
    }


    // A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1; res[1] = 1;
        for (int i=2; i<n; i++)
        {
            res[i] = 0;
            for (int j=1; j<=m && j<=i; j++)
                res[i] += res[i-j];
        }
        return res[n-1];
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }

    // Driver method
    public static void main(String[] args)
    {
        int s = 4, m = 2;
        System.out.println("Nuber of ways = " + countWays(s, m));
    }

}
