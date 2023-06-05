package ru.gozhan.leetcode.easy;

import java.util.Stack;

/**
 * Link to task #20 <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 *
 */

public class ValidParentheses20 {

    public static void main(String[] args) {

        System.out.println(Solution.isValid("()[]{}"));

    }

    static class Solution {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                switch (ch) {
                    case '(', '[', '{' -> stack.push(ch);
                    case ')' -> {
                        if (stack.empty() || stack.pop() != '(') return false;
                    }
                    case ']' -> {
                        if (stack.empty() || stack.pop() != '[') return false;
                    }
                    case '}' -> {
                        if (stack.empty() || stack.pop() != '{') return false;
                    }
                }
            }
            return stack.empty();
        }

    }

}
