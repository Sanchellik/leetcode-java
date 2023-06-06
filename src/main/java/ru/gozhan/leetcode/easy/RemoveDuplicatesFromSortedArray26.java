package ru.gozhan.leetcode.easy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Link to task #26 <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">...</a>
 */

public class RemoveDuplicatesFromSortedArray26 {

    public static void main(String[] args) {
    }

    static class Solution {

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int uniqueCount = 1;
            int slow = 0;

            for (int fast = 1; fast < nums.length; fast++) {
                if (nums[fast] != nums[slow]) {
                    nums[++slow] = nums[fast];
                    uniqueCount++;
                }
            }
            return uniqueCount;
        }

    }

}
