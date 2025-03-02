package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode888 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal;
        int bobTotal;
        aliceTotal = Arrays.stream(aliceSizes).sum();
        bobTotal = Arrays.stream(bobSizes).sum();
        for (int aliceSize : aliceSizes)
            for (int bobSize : bobSizes)
                if ((aliceTotal - aliceSize + bobSize) == (bobTotal - bobSize + aliceSize))
                    return new int[]{aliceSize, bobSize};
        return new int[0];
    }
}
