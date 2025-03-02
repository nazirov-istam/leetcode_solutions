package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode169 {
    public static void main(String[] args) {
        System.out.println(majorityElement1(new int[]{3, 2, 3}));
    }

    public int majorityElement(int[] nums) {
        int counter = 0;
        int result = 0;
        for (int num : nums) {
            for (int i : nums) {
                if (num == i) {
                    counter++;
                }
            }
            if (counter > (nums.length / 2)) {
                result = num;
                break;
            } else {
                counter = 0;
            }
        }
        return result;
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
