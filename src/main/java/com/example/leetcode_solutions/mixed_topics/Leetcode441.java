package com.example.leetcode_solutions.mixed_topics;

public class Leetcode441 {
    public static void main(String[] args) {
        int a = (int) Math.pow(2, 31) - 1;
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        int result = 0;
        if (n == 1 || n == 2) {
            result = 1;
        } else if (n == 3) {
            result = 2;
        } else {
            for (int i = 1; i < n; i++) {
                if (n - i > i) {
                    result++;
                    n -= i;
                } else {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}

