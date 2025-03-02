package com.example.leetcode_solutions.mixed_topics;

public class Leetcode191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
