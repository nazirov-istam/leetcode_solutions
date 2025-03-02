package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode832 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(ints)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {

                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp;
            }
        }
        return image;
    }
}
