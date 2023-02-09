package com.examplecodewars.codewars.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {

        Integer points = 100;
        final Integer totalPoints = points;
        final int pointsForEach = totalPoints / 3;


        final int remaining = totalPoints - pointsForEach * 3;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

//        ListNode listNode = new ListNode(2);
//        listNode.next = new ListNode(4);
//        listNode.next.next = new ListNode(3);
//
//        ListNode listNode2 = new ListNode(5);
//        listNode2.next = new ListNode(7);
//        listNode2.next.next = new ListNode(4);

        ListNode listNode = new ListNode(5);


        ListNode listNode2 = new ListNode(5);



        final ListNode listNode1 = addTwoNumbers.addTwoNumbers(listNode, listNode2);
    }
}
