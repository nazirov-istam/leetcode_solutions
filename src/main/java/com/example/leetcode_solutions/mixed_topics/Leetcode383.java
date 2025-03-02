package com.example.leetcode_solutions.mixed_topics;

public class Leetcode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        return magazine.contains(ransomNote);
    }
}
