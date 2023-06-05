package ru.gozhan.leetcode.easy;

/**
 * Link to task #21 <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 */

public class MergeTwoSortedLists21 {

    public static void main(String[] args) {

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        for (int i = 1; i < 4; ++i) {
            temp1.val = i;
            temp2.val = 2 * i;

            temp1.next = new ListNode();
            temp2.next = new ListNode();

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1 = null;
        temp2 = null;
        ListNode result = Solution.mergeTwoLists(list1, list2);

        System.out.println(result);

    }

    static class Solution {

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode preResult = new ListNode(-1);
            ListNode temp = preResult;

            while (list1 != null && list2 != null) {

                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;
            }

            temp.next = (list1 == null) ? list2 : list1;
            return preResult.next;
        }

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

    }

}
