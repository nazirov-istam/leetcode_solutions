package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode922 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(sortArrayByParityII(
                        new int[]{3, 1, 4, 2})));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int odd = 1, even = 0;
        int[] result = new int[nums.length];
        for (int num : nums) {
            if (num % 2 == 0) {
                result[even] = num;
                even += 2;
            } else {
                result[odd] = num;
                odd += 2;
            }
        }
        return result;
    }
}
