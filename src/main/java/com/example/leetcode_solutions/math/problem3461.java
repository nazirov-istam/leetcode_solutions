package com.example.leetcode_solutions.math;

public class problem3461 {
    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
    }

    public static boolean hasSameDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        while (stringBuilder.length() != 2) {
            StringBuilder stringBuilder1 = new StringBuilder();
            for (int i = 0; i < stringBuilder.length() - 1; i++) {
                stringBuilder1.append((Integer.parseInt(String.valueOf(stringBuilder.charAt(i))) + Integer.parseInt(String.valueOf(stringBuilder.charAt(i + 1)))) % 10);
            }
            stringBuilder.replace(0, stringBuilder.length(), String.valueOf(stringBuilder1));
        }
        return Integer.parseInt(String.valueOf(stringBuilder.charAt(0))) == Integer.parseInt(String.valueOf(stringBuilder.charAt(1)));
    }
}
