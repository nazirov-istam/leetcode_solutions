package com.example.leetcode_solutions.counting;

import java.util.HashMap;

public class problem1128 {
    public static void main(String[] args) {
        System.out.println(numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
    }

    // 0-1 / 0-2 / 0-3
    // 1-2 / 1-3
    // 2-3

    public static int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int res = 0;

        for (int[] d : dominoes) {
            int key = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            int count = freq.getOrDefault(key, 0);
            res += count;
            freq.put(key, count + 1);
        }

        return res;
    }
}
