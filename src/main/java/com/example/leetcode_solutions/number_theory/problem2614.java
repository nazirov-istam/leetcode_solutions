package com.example.leetcode_solutions.number_theory;

public class problem2614 {
    public static void main(String[] args) {
        System.out.println(diagonalPrime(
                new int[][]{{1, 2, 3}, {5, 17, 7}, {9, 11, 10}})
        );
    }

    public static int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            int mainVal = nums[i][i];
            int antiVal = nums[i][n - i - 1];

            if (isPrime(mainVal)) {
                maxPrime = Math.max(maxPrime, mainVal);
            }

            if (isPrime(antiVal)) {
                maxPrime = Math.max(maxPrime, antiVal);
            }
        }
        return maxPrime;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int sqrt = (int)Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
