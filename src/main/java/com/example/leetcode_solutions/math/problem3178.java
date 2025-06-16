package com.example.leetcode_solutions.math;

public class problem3178 {
    public static void main(String[] args) {
        System.out.println(numberOfChild(5, 6));
    }

    public static int numberOfChild(int n, int k) {
        int var = 0;
        boolean direction = true;

        while (k > 0) {
            if (direction) {
                if (var == n - 1) {
                    direction = false;
                    var--;
                } else {
                    var++;
                }
            } else {
                if (var == 0) {
                    direction = true;
                    var++;
                } else {
                    var--;
                }
            }
            k--;
        }
        return var;
    }
}
