package com.example.leetcode_solutions.prefix_sum;

public class problem3354 {
    public static void main(String[] args) {
        System.out.println(countValidSelections(new int[]{1, 0, 2, 0, 3}));
    }

    public static int countValidSelections(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; ++i) {
            left[i] = left[i - 1] + nums[i - 1];
            right[n - i - 1] = right[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] != 0) {
                continue;
            }
            if (left[i] == right[i]) {
                res += 2;
            }
            if (Math.abs(left[i] - right[i]) == 1) {
                res += 1;
            }
        }
        return res;
    }
}
