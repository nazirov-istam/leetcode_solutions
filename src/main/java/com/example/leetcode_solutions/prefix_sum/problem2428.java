package com.example.leetcode_solutions.prefix_sum;

public class problem2428 {
    public static void main(String[] args) {
        System.out.println(maxSum2(
                new int[][]
                        {
                                {520626, 685427, 788912, 800638, 717251, 683428},
                                {23602, 608915, 697585, 957500, 154778, 209236},
                                {287585, 588801, 818234, 73530, 939116, 252369}}
        ));
    }

    // 5095181

    public static int maxSum(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            int sum = 0;
            for (int j = i; j <= i + 2; j++) {
                sum += grid[i][j];
                sum += grid[i + 2][j];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static int maxSum2(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            //Running the for loop for the row-2  times
            for (int j = 0; j < grid[0].length - 2; j++) {
                //Running the inner for loop for the col-2  times
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
