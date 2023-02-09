package com.examplecodewars.codewars;

import java.util.HashMap;
import java.util.Map;

public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        Map<String, Integer> cache = new HashMap<>();
        return longestSlideDownAt(pyramid, 0, 0, cache);
    }

    private static int longestSlideDownAt(int[][] pyramid, int x, int y, Map<String, Integer> cache) {
        if (x >= pyramid.length || y >= pyramid[x].length) {
            return 0;
        }

        if (x == pyramid.length - 1) {
            return pyramid[x][y];
        }

        String key = "$" + x + " " + y;

        if(cache.containsKey(key)) {
            return cache.get(key);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 2; i++) {
            int tmp = longestSlideDownAt(pyramid, x + 1, y + i, cache);
            if (tmp > max) {
                max = tmp;
            }
        }

        cache.put(key, pyramid[x][y] + max);
        return cache.get(key);

    }


}
