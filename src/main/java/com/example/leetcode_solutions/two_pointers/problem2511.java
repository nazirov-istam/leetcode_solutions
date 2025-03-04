package com.example.leetcode_solutions.two_pointers;

public class problem2511 {
    public static void main(String[] args) {
        System.out.println(captureForts(new int[]{1, 0, 0, -1, 0, 0, 0, 1}));
        System.out.println(captureForts(new int[]{0, 0, 1, -1}));
    }

    public static int captureForts(int[] forts) {
        int maxCaptured = 0;
        int lastFort = -1;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (lastFort != -1 && forts[i] != forts[lastFort]) {
                    maxCaptured = Math.max(maxCaptured, i - lastFort - 1);
                }
                lastFort = i;
            }
        }
        return maxCaptured;
    }
}
