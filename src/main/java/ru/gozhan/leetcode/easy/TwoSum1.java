package ru.gozhan.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(Solution.twoSum(
                        new int[]{3, 2, 4},
                        7
                ))
        );
    }

}

class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            if (map.containsKey(numberToFind)) {
                return new int[]{map.get(numberToFind), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
