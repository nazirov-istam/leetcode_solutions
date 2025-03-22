package com.example.leetcode_solutions.array;

import java.util.Arrays;

public class problem1877 {
    public static void main(String[] args) {
        System.out.println(minPairSum(new int[]{3,5,4,2,4,6}));
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length / 2; i++) {
            result = Math.max(result, nums[i] + nums[nums.length - i - 1]);
        }
        return result;
    }
}
