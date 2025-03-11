package com.example.leetcode_solutions.string;

import java.util.HashSet;
import java.util.Set;

public class problem3120 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
    }

    public static int numberOfSpecialChars(String word) {
        Set<String> set = new HashSet<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < word.length(); i++) {
            if (alphabet.contains(String.valueOf(word.charAt(i))) && word.contains(String.valueOf(word.charAt(i)).toUpperCase())
                    || (!alphabet.contains(String.valueOf(word.charAt(i))) && word.contains(String.valueOf(word.charAt(i)).toLowerCase()))) {
                set.add(String.valueOf(word.charAt(i)).toLowerCase());
            }
        }
        return set.size();
    }
}
