package ru.gozhan.leetcode.easy;

import java.util.ArrayList;

/**
 * Link to task #13 <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 *
 */

public class RomanToInteger13 {

    public static void main(String[] args) {

        System.out.println(Solution.romanToInt("MCMXCIV"));

    }

    static class Solution {

        public static int romanToInt(String s) {
            int answer = 0;
            int number = 0;
            for (int i = s.length() - 1; i >= 0; --i) {
                switch (s.charAt(i)) {
                    case 'I' -> number = 1;
                    case 'V' -> number = 5;
                    case 'X' -> number = 10;
                    case 'L' -> number = 50;
                    case 'C' -> number = 100;
                    case 'D' -> number = 500;
                    case 'M' -> number = 1000;
                }
                if (4 * number < answer) answer -= number;
                else answer += number;
            }
            return answer;
        }

    }

}
