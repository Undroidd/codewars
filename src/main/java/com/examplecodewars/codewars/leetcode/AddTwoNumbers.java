package com.examplecodewars.codewars.leetcode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        boolean addition = false;

        while(l1 != null && l2 != null) {
            if(addition) l1.val++;
            int sum = l1.val + l2.val;
            int val = 0;
            if(sum > 9) {
                val = sum % 10;
                addition = true;
            } else {
                val = sum;
                addition = false;
            }

            node = insert(node, val);

//            addition = add(l1, l2, node, addition);
//            node.next = new ListNode(5);
//            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            if(addition) {
                l1.val++;
                if(l1.val > 9) {
                    l1.val = l1.val % 10;
                    addition = true;
                } else {
                    addition = false;
                }
            }
            node = insert(node, l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            if(addition) {
                l2.val++;
                if(l2.val > 9) {
                    l2.val = l2.val % 10;
                    addition = true;
                } else {
                    addition = false;
                }
            }
            node = insert(node, l2.val);
            l2 = l2.next;
        }


        if(addition) node = insert(node, 1);

//        node = insert(node, addNodes(l1, l2, addition));
        return node;
    }

    private boolean add(ListNode l1, ListNode l2, ListNode node, boolean addition) {
        if(addition) l1.val++;
        int sum = l1.val + l2.val;
        if(sum > 9) {
            node.val = sum % 10;
            addition = true;
        } else {
            node.val = sum;
            addition = false;
        }
        return addition;
    }

    private int addNodes(ListNode l1, ListNode l2, Boolean addition) {
        if(addition) l1.val++;
        int sum = l1.val + l2.val;
        int val = 0;
        if(sum > 9) {
            val = sum % 10;
            addition = true;
        } else {
            val = sum;
            addition = false;
        }
        return val;
    }

    // Method to insert a new node
    public static ListNode insert(ListNode list, int data)
    {
        // Create a new node with given data
        ListNode new_node = new ListNode(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list == null) {
            list = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            ListNode last = list;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

}
