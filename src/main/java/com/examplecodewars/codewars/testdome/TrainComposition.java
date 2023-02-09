package com.examplecodewars.codewars.testdome;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrainComposition {
    Deque<Integer> deque = new ArrayDeque<>();

    public void attachWagonFromLeft(int wagonId) {
        deque.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        deque.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        return deque.pollFirst();
    }

    public int detachWagonFromRight() {
        return deque.pollLast();
    }

    public static void main(String[] args) {

        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromLeft()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}
