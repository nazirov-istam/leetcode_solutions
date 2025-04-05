package com.example.leetcode_solutions.array;

public class problem1863 {
    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{1, 3}));
    }

    static int total = 0;

    public static int subsetXORSum(int[] nums) {
        total = 0;
        dfs(nums, 0, 0);
        return total;
    }

    private static void dfs(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            total += currentXOR;
            return;
        }
        dfs(nums, index + 1, currentXOR ^ nums[index]);
        dfs(nums, index + 1, currentXOR);
    }
}
