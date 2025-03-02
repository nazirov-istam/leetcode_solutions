package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode1005 {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        while (k > 0) {
            Arrays.sort(nums);
            nums[0] *= -1;
            k--;
        }
        return Arrays.stream(nums).sum();
    }
}
