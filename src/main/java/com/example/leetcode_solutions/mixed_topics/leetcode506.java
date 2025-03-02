package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode506 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] add = Arrays.copyOf(score, score.length);
        Arrays.sort(add);
        String[] ans = new String[score.length];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < add.length; i++) {
            if (i == add.length - 1) map.put(add[i], "Gold Medal");
            else if (i == add.length - 2) map.put(add[i], "Silver Medal");
            else if (i == add.length - 3) map.put(add[i], "Bronze Medal");
            else {
                map.put(add[i], Integer.toString(add.length - i));
            }
        }
        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}
