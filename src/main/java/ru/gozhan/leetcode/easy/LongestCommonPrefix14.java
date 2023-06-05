package ru.gozhan.leetcode.easy;

import java.util.Arrays;

/**
 * Link to task #14 <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
 *
 */

public class LongestCommonPrefix14 {

    public static void main(String[] args) {

        System.out.println(Solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }

    static class Solution {

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            int index = 0;
            while(index < strs[0].length() && index < strs[strs.length - 1].length()){
                if(strs[0].charAt(index) == strs[strs.length - 1].charAt(index)){
                    index++;
                } else {
                    break;
                }
            }
            return strs[0].substring(0, index);
        }

    }

}
