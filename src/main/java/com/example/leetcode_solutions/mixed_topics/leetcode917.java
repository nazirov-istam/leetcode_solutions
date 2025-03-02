package com.example.leetcode_solutions.mixed_topics;

import java.util.Stack;

public class leetcode917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }

    public static String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack<>();
        for (char c: s.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }
        return ans.toString();
    }
}
