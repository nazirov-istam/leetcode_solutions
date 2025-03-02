package com.example.leetcode_solutions.mixed_topics;

import java.util.*;

public class leetcode819 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[!?',;\\.]", " ");
        String[] words = paragraph.split("\\s+");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
            }
        }
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostCommon;
    }
}
