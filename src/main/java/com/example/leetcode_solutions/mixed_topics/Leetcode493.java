package com.example.leetcode_solutions.mixed_topics;

public class Leetcode493 {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] > 2 * nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
