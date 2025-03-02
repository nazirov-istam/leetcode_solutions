package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1200 {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int difference = Math.abs(arr[i] - arr[i - 1]);
            if (difference < min) {
                min = difference;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                result.add(list);
            }
        }
        return result;
    }
}
