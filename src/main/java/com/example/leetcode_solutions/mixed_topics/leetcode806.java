package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode806 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz")));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = s.length() / 10;
        int i = s.length() - (s.length() / 10) * 10;
        if (s.length() % 10 != 0) {
            result[0]++;
        }
        result[1] = i * 10;
        return result;
    }
}
