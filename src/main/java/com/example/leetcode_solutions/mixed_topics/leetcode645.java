package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{3, 2, 3, 4, 6, 5})));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        int[] result = new int[2];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                result[1] = i;
            } else if (count[i] == 2) {
                result[0] = i;
            }
        }
        return result;
    }
}
