package com.example.leetcode_solutions.monotonic_stack;

import java.util.Arrays;

public class problem503 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(nextGreaterElements
                        (new int[]{0, -2, -3})));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        boolean checker;
        for (int i = 0; i < nums.length; i++) {
            checker = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    result[i] = nums[j];
                    checker = false;
                    break;
                }
            }
            if (checker && i > 0) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] < nums[j]) {
                        result[i] = nums[j];
                        checker = false;
                        break;
                    }
                }
            }
            if (checker) {
                result[i] = -1;
            }
        }
        return result;
    }
}
