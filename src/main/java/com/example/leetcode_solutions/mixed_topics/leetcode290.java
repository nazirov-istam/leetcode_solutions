package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class leetcode290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        if (pattern.length() != Arrays.stream(s.split(" ")).toArray().length) {
            return false;
        } else {
            HashMap<Character, String> hashMap = new HashMap<>();
            HashMap<String, Character> reverseMap = new HashMap<>();
            String[] words = s.split(" ");
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];

                if (hashMap.containsKey(c)) {
                    if (!Objects.equals(hashMap.get(c), word)) {
                        return false;
                    }
                } else {
                    hashMap.put(c, word);
                }
                if (reverseMap.containsKey(word)) {
                    if (!Objects.equals(reverseMap.get(word), c)) {
                        return false;
                    }
                } else {
                    reverseMap.put(word, c);
                }
            }
        }
        return true;
    }
}