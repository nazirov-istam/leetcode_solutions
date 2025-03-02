package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pis;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            pis = price - lsf;
            if (op < pis) {
                op = pis;
            }
        }
        return op;
    }
}
