package com.example.leetcode_solutions.prefix_sum;

public class problem1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00"));
    }

    public static int maxScore(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] chs = s.toCharArray();
        int leftZero = 0;
        int ones = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < chs.length - 1; i++) {
            if (chs[i] == '1') {
                ones++;
            } else {
                leftZero++;
            }
            max = Math.max(max, leftZero - ones);
        }
        if (chs[chs.length - 1] == '1') {
            ones++;
        }
        return ones + max;
    }
}
