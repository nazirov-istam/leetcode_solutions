package com.example.leetcode_solutions.mixed_topics;

public class leetcode997 {
    public static void main(String[] args) {
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0) {
            return n == 1 ? 1 : -1;
        }
        int[] trusts = new int[n + 1];
        int[] trustedBy = new int[n + 1];

        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trusts[a]++;
            trustedBy[b]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustedBy[i] == n - 1 && trusts[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
