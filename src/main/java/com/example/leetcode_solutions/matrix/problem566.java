package com.example.leetcode_solutions.matrix;

import java.util.Arrays;

public class problem566 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 2)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(r * c != m * n) return mat;
        int[] flat = new int[r * c];
        int index = 0;

        for (int i = 0; i < m && index < flat.length; i++) {
            for (int j = 0; j < n && index < flat.length; j++) {
                flat[index++] = mat[i][j];
            }
        }

        while (index < flat.length) {
            flat[index++] = 0;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = flat[i];
        }
        return res;
    }
}
