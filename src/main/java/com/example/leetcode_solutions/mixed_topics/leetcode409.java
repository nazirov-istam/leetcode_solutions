package com.example.leetcode_solutions.mixed_topics;

import java.util.HashMap;

public class leetcode409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static int longestPalindrome(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean var = false;
        for (Integer a : map.values()) {
            if (a % 2 == 0) {
                result += a;
            } else {
                result += a - 1;
                var = true;
            }
        }
        return (var) ? result + 1 : result;
    }
}
