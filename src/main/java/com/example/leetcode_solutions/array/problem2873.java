package com.example.leetcode_solutions.array;

public class problem2873 {
    public static void main(String[] args) {
        System.out.println(maximumTripletValue(
                new int[]{1000000, 1, 1000000}));
    }

    public static long maximumTripletValue(int[] nums) {
        long result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    result = Math.max(result, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return Math.max(result, 0);
    }
}
