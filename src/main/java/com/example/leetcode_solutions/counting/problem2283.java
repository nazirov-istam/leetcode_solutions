package com.example.leetcode_solutions.counting;

import java.util.HashMap;
import java.util.Map;

public class problem2283 {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    public static boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            char expectedDigit = (char) (i + '0');
            int expectedCount = num.charAt(i) - '0';

            int actualCount = map.getOrDefault(expectedDigit, 0);

            if (expectedCount != actualCount) {
                return false;
            }
        }
        return true;
    }
}