package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode455 {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort the greed factors
        Arrays.sort(s); // Sort the cookie sizes

        int i = 0; // Pointer for children (greed array)
        int j = 0; // Pointer for cookies (size array)

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // If the current cookie can satisfy the current child
                i++; // Move to the next child
            }
            j++; // Move to the next cookie
        }

        return i; // Number of satisfied children
    }
}
