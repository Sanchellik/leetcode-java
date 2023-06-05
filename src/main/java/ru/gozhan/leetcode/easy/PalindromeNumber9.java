package ru.gozhan.leetcode.easy;

import java.util.ArrayList;

/**
 * Link to task #1 <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 *
 */

public class PalindromeNumber9 {

    public static void main(String[] args) {

        System.out.println(Solution.isPalindrome(121));

    }

    static class Solution {

        public static boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            ArrayList<Integer> arrayNumber = parseNumberToArrayList(x);
            for (int i = 0; i < arrayNumber.size() / 2; ++i) {
                if (!arrayNumber.get(i).equals(arrayNumber.get(arrayNumber.size() - i - 1))) {
                    return false;
                }
            }
            return true;
        }

        public static ArrayList<Integer> parseNumberToArrayList(int number) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int temp = number;
            while (temp > 9) {
                arrayList.add(temp % 10);
                temp = temp / 10;
            }
            arrayList.add(temp);
            return arrayList;
        }

    }

}
