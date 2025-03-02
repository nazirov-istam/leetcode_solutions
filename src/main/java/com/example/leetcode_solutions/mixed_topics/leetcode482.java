package com.example.leetcode_solutions.mixed_topics;

public class leetcode482 {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        String cleaned = s.replace("-", "").toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            result.append(cleaned.charAt(i));
            if ((cleaned.length() - i) % k == 0 && i != 0) {
                result.append("-");
            }
        }
        return result.reverse().toString();
    }
}
