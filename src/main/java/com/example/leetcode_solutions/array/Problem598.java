package com.example.leetcode_solutions.array;

import java.util.Arrays;

public class Problem598 {
    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        int[][] res = new int[m][n];
        for (int[] op : ops) {
            for (int j = 0; j < op[0]; j++) {
                for (int k = 0; k < op[1]; k++) {
                    res[j][k] += 1;
                }
            }
        }
        int[] array = new int[res.length * res[0].length];
        int a = 0;
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                array[a++] = re[j];
            }
        }
        int result = 1;
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] == array[i - 1]) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}