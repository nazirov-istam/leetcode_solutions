package com.example.leetcode_solutions.array;

public class problem1550 {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1, 1, 1}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length <= 2) return false;
        for (int i = 0; i < arr.length; i++) {
            if (odd(arr[i]) && (i + 2 < arr.length) && (odd(arr[i + 1]) && odd(arr[i + 2]))) {
                return true;
            }
        }
        return false;
    }

    public static boolean odd(int num) {
        return num % 2 != 0;
    }
}
