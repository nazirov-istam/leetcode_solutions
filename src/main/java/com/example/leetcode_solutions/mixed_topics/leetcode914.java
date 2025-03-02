package com.example.leetcode_solutions.mixed_topics;

import java.util.HashMap;
import java.util.Map;

public class leetcode914 {
    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
    }

    // 1122334455
    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        int gcd = -1;
        for (int freq : map.values()) {
            if (gcd == -1) {
                gcd = freq;
            } else {
                gcd = gcd(gcd, freq);
            }
        }
        return gcd >= 2;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
