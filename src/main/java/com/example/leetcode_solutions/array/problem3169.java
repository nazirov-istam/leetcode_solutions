package com.example.leetcode_solutions.array;

import java.util.Arrays;
import java.util.Comparator;

public class problem3169 {
    public static void main(String[] args) {
        System.out.println(countDays(10, new int[][]{{5, 7}
                , {1, 3}, {9, 10}}));
    }

    public static int countDays(int days, int[][] meetings) {
        int freeDays = 0, lastEnd = 0;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            if (start > lastEnd + 1) {
                freeDays += (start - lastEnd - 1);
            }

            lastEnd = Math.max(lastEnd, end);
        }
        freeDays += days - lastEnd;
        return freeDays;
    }
}
