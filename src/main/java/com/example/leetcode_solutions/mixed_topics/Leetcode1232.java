package com.example.leetcode_solutions.mixed_topics;

public class Leetcode1232 {
    public static void main(String[] args) {
        int[][] nums = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(checkStraightLine(nums));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int[] first = coordinates[0];
        int[] second = coordinates[1];
        double slope = getSlope(first, second);
        for (int i = 2; i < coordinates.length; i++) {
            int[] point = coordinates[i];
            double currentSlope = getSlope(first, point);
            if (currentSlope != slope) {
                return false;
            }
        }
        return true;
    }

    private static double getSlope(int[] point1, int[] point2) {
        if (point1[0] == point2[0]) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (point2[1] - point1[1]) / (double) (point2[0] - point1[0]);
    }
}
