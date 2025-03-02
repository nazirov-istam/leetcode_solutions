package com.example.leetcode_solutions.mixed_topics;

import java.util.HashMap;
import java.util.Map;

public class leetcode1160 {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"},"atach"));
    }

    public static int countCharacters(String[] words, String chars) {
        // Create a frequency map for characters in chars
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int result = 0;

        // Check each word if it can be formed using chars
        for (String word : words) {
            Map<Character, Integer> wordFrequency = new HashMap<>();

            // Populate frequency map for characters in the current word
            for (char c : word.toCharArray()) {
                wordFrequency.put(c, wordFrequency.getOrDefault(c, 0) + 1);
            }

            // Check if the word can be formed using chars
            boolean canFormWord = true;
            for (Map.Entry<Character, Integer> entry : wordFrequency.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();

                if (!charFrequency.containsKey(c) || charFrequency.get(c) < count) {
                    canFormWord = false;
                    break;
                }
            }

            // If the word can be formed, add its length to the result
            if (canFormWord) {
                result += word.length();
            }
        }
        return result;
    }
}
