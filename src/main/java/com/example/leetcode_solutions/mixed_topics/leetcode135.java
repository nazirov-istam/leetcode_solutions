package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,3,2,2,1}));
    }

    public static int candy(int[] ratings) {
        if (ratings.length == 0) return 0;
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        return totalCandies;
    }
}
