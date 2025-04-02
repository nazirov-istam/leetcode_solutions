package com.example.leetcode_solutions.prefix_sum;

public class problem3427 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{3, 1, 1, 2}));
    }

    public static int subarraySum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                result += nums[j];
            }
        }
        return result;
    }
}
