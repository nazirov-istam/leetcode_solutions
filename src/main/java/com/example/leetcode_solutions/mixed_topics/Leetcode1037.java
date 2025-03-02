package com.example.leetcode_solutions.mixed_topics;

public class Leetcode1037 {
    public static void main(String[] args) {
        System.out.println(isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
    }

    public static boolean isBoomerang(int[][] points) {
        return !((points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) == (points[0][0] - points[2][0]) * (points[0][1] - points[1][1]));
    }
}
