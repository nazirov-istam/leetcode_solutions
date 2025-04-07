package com.example.leetcode_solutions.sorting;

import java.util.Arrays;

public class problem1968 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
