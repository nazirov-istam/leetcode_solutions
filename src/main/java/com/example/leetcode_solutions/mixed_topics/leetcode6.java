package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(rows).forEach(row -> {
            for (char c : row) {
                result.append(c);
            }
        });
        System.gc();
        return result.toString();
    }
}
