package com.example.leetcode_solutions.mixed_topics;

public class Leetcode334 {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
