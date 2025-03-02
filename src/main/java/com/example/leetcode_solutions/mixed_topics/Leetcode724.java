package com.example.leetcode_solutions.mixed_topics;

public class Leetcode724 {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int ls = 0;
        int rs;
        int PI = 0;
        for (int num : nums) {
            PI += num;
        }
        rs = PI;
        for (int i = 0; i < nums.length; i++) {
            ls += nums[i];
            if (ls == rs)
                return i;
            rs -= nums[i];
        }
        return -1;
    }
}
