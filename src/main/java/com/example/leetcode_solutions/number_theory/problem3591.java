package com.example.leetcode_solutions.number_theory;

import java.util.Arrays;

public class problem3591 {
    public static void main(String[] args) {
        System.out.println(checkPrimeFrequency(new int[]{1,2,3,4,5}));
    }

    public static boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);
        int frequency = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                frequency++;
            } else {
                if (isPrime(frequency)) {
                    return true;
                }
                frequency = 1;
            }
        }
        return false;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
