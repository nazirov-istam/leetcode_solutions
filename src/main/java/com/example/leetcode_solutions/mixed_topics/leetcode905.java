package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode905 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] newArray = new int[nums.length];
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                newArray[a++] = num;
            } else {
                newArray[newArray.length - 1 - b] = num;
                b++;
            }
        }
        return newArray;
    }
}
