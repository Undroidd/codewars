package com.examplecodewars.codewars;

import com.google.common.collect.Sets;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Hamming {

    public static long hamming(int n) {

        PriorityQueue<BigInteger> queue = new PriorityQueue<>();
        update(BigInteger.ONE, queue);
        BigInteger lowest = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            lowest = queue.poll();
            while (queue.peek().equals(lowest))
                queue.poll();
            update(lowest, queue);
        }
        return lowest.longValue();
    }

    private static void update(BigInteger x,
                                       PriorityQueue<BigInteger> pq) {
        pq.offer(x.multiply(BigInteger.valueOf(2)));
        pq.offer(x.multiply(BigInteger.valueOf(3)));
        pq.offer(x.multiply(BigInteger.valueOf(5)));
    }

    public static long hamming2(int n) {
        if (n <= 0) return -1;
        TreeSet<Long> ts = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long smallest = 1;
        for (int i = 1; i < n; i++) {
            smallest = ts.pollFirst();
            ts.add(smallest * 2);
            ts.add(smallest * 3);
            ts.add(smallest * 5);
        }
        return smallest;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public static void testme() {
        final HashSet<String> d = Sets.newHashSet("e");
        returnOrAttemptCartMerge(d);
        d.isEmpty();
        returnOrAttemptCartMergee(d);
        d.isEmpty();
    }

    private static void returnOrAttemptCartMerge(Set<String> customerIds) {
        customerIds = Sets.newHashSet("d");
    }

    private static void returnOrAttemptCartMergee(Set<String> customerIds) {
        final Set<String> collect = customerIds.stream().peek(System.out::println).collect(Collectors.toSet());
        customerIds = Sets.newHashSet("d");
    }
}
