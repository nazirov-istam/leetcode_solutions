package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode747 {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
    }

    public static int dominantIndex(int[] nums) {
        int[] newArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            if (nums[nums.length - 1] != newArray[i]) {
                if (!(nums[nums.length - 1] >= newArray[i] * 2)) {
                    result = -1;
                    break;
                }
            } else {
                result = i;
            }
        }
        return result;
    }
}
