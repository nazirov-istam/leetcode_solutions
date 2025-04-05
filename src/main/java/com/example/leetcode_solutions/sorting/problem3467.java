package com.example.leetcode_solutions.sorting;

import java.util.Arrays;

public class problem3467 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(transformArray(new int[]{4, 3, 2, 1})));
    }

    public static int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
