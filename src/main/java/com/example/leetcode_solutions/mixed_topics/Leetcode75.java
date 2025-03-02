package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode75 {
    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 1});
    }

    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i <= r; )
            if (nums[i] == 0)
                swap(nums, i++, l++);
            else if (nums[i] == 1)
                ++i;
            else
                swap(nums, i, r--);
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
