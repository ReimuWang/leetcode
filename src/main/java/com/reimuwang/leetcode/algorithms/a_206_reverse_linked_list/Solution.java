package com.reimuwang.leetcode.algorithms.a_206_reverse_linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

  public ListNode reverseList(ListNode head) {
    if (null == head || null == head.next) {
      return head;
    }
    ListNode next = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return next;
  }
}
