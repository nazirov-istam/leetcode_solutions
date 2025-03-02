package com.example.leetcode_solutions.mixed_topics;

public class leetcode633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }

    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b =  c - (int)(a * a);
            int i = 1, sum = 0;
            while (sum < b) {
                sum += i;
                i += 2;
            }
            if (sum == b)
                return true;
        }
        return false;
    }
}
