package com.example.leetcode_solutions.mixed_topics;

public class leetcode769 {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{1, 0, 2, 3, 4}));
    }

    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] prefixMax = arr.clone();
        int[] suffixMin = arr.clone();
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i], prefixMax[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i], suffixMin[i + 1]);
        }
        int chunks = 0;
        for (int i = 0; i < n ; i++) {
            if (i == 0 || suffixMin[i] > prefixMax[i - 1]) {
                chunks++;
            }
        }
        return chunks;
    }
}
