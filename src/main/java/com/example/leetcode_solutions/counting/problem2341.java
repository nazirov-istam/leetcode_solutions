package com.example.leetcode_solutions.counting;

import java.util.Arrays;

public class problem2341 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{0})));
    }

    public static int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        for (int i : nums) cnt[i]++;
        int pairs = 0, leftover = 0;
        for (int i : cnt) {
            pairs += i / 2;
            leftover += i % 2;
        }
        return new int[]{pairs, leftover};
    }
}
