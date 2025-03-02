package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode976 {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{1, 2, 1, 10}));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[nums.length - 1 - i] + nums[nums.length - 2 - i] > nums[nums.length - 3 - i]
                    && nums[nums.length - 1 - i] + nums[nums.length - 3 - i] > nums[nums.length - 2 - i]
                    && nums[nums.length - 2 - i] + nums[nums.length - 3 - i] > nums[nums.length - 1 - i]) {
                return nums[nums.length - 1 - i] + nums[nums.length - 2 - i] + nums[nums.length - 3 - i];
            }
        }
        return 0;
    }
}
