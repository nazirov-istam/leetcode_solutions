package com.example.leetcode_solutions.mixed_topics;

public class leetcode796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        String var, var2 = s;
        int result = s.length() - 1;
        while (result > 0) {
            result--;
            var = var2.substring(1);
            var += var2.charAt(0);
            if (var.equals(goal)) {
                return true;
            } else {
                var2 = var;
            }
        }
        return false;
    }
}
