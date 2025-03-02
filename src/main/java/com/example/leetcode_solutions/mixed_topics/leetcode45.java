package com.example.leetcode_solutions.mixed_topics;

public class leetcode45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{1, 2}));
    }

    public static int jump(int[] nums) {
        int jumps = 0;
        int current_end = 0;
        int farthest = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == current_end) {
                jumps++;
                current_end = farthest;
            }
            if (current_end >= nums.length - 1) {
                break;
            }
        }
        return jumps;
    }
}
