package com.example.leetcode_solutions.mixed_topics;

public class leetcode908 {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{0, 10}, 2));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int max_val = nums[0];
        int min_val = nums[0];

        for (int num : nums) {
            min_val = Math.min(min_val, num);
            max_val = Math.max(max_val, num);
        }

        if (min_val + k >= max_val - k) {
            return 0;
        } else {
            return (max_val - k) - (min_val + k);
        }
    }
}
