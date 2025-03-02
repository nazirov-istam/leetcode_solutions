package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
    public static void main(String[] args) {
        String a = "23";
        System.out.println(letterCombinations(a));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinationsHelper(digits, result, "", 0, mapping);
        return result;
    }

    private static void letterCombinationsHelper(String digits, List<String> result, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(digits, result, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
