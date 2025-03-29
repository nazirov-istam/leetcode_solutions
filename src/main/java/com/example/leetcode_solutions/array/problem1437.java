package com.example.leetcode_solutions.array;

public class problem1437 {
    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[]{0, 1, 1, 0, 1}, 4));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (lastIndex != -1 && (i - lastIndex - 1) < k) {
                    return false;
                }
                lastIndex = i;
            }
        }
        return true;
    }
}
