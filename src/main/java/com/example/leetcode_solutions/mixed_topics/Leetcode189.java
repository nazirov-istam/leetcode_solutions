package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);

    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        int n = nums.length;
        k %= n; // to handle cases where k > n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
