package com.example.leetcode_solutions.mixed_topics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Check if the number of occurrences is unique
        Set<Integer> uniqueValues = new HashSet<>();
        for (int count : occurrences.values()) {
            if (!uniqueValues.add(count)) {
                // If count is not unique, return false
                return false;
            }
        }
        return true;
    }
}

