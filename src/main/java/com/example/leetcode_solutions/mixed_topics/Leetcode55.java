package com.example.leetcode_solutions.mixed_topics;

public class Leetcode55 {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 1, 4};
        System.out.println(canJump(a));
    }

    public static boolean canJump(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > result) {
                return false;
            } else {
                result = Math.max(result, i + nums[i]);
            }
        }
        return true;
    }
}
