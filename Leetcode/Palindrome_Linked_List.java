package Leetcode;

/*
Given the head of a singly linked list, return true if it is a palindrome.
 */

import java.util.*;

public class Palindrome_Linked_List {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        // Convert LinkedList into ArrayList.
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // Use two-pointer technique to check for palindrome.
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(1);
        first.next =second;
        second.next=third;
        third.next =forth;
        boolean palindrome = isPalindrome(first);
        System.out.println(palindrome);
    }
}
