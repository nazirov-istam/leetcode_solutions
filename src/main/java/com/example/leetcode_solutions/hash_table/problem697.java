package com.example.leetcode_solutions.hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem697 {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();      // Element -> count
        Map<Integer, Integer> firstIndex = new HashMap<>(); // Element -> first occurrence
        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }

            count.put(num, count.getOrDefault(num, 0) + 1);

            if (count.get(num) > degree) {
                degree = count.get(num);
                minLength = i - firstIndex.get(num) + 1;
            } else if (count.get(num) == degree) {
                minLength = Math.min(minLength, i - firstIndex.get(num) + 1);
            }
        }

        return minLength;
    }
}
