package com.example.leetcode_solutions.array;

import java.util.ArrayList;
import java.util.List;

public class problem1380 {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRowValues = new ArrayList<>();
        List<Integer> maxColValues = new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        int cols = matrix[0].length;

        for (int[] ints : matrix) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                minVal = Math.min(minVal, ints[j]);
            }
            minRowValues.add(minVal);
        }

        for (int j = 0; j < cols; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                maxVal = Math.max(maxVal, ints[j]);
            }
            maxColValues.add(maxVal);
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (minRowValues.contains(anInt) && maxColValues.contains(anInt)) {
                    result.add(anInt);
                }
            }
        }
        return result;
    }
}
