package com.example.leetcode_solutions.mixed_topics;

public class leetcode844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        s = removeLettersBeforeHash(s);
        t = removeLettersBeforeHash(t);
        return s.equals(t);
    }

    public static String removeLettersBeforeHash(String s) {
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}
