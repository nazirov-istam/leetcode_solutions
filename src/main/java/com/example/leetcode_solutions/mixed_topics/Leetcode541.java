package com.example.leetcode_solutions.mixed_topics;

public class Leetcode541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseStr(s, 2));
    }

    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i, end = Math.min(i + k - 1, s.length() - 1);
            while (start < end) {
                char temp = a[start];
                a[start++] = a[end];
                a[end--] = temp;
            }
        }
        return String.valueOf(a);
    }
}
