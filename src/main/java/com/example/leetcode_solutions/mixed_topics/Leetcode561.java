package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode561 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort the array in ascending order
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // add the minimum value of each pair to the sum
        }
        return sum;
    }
}
