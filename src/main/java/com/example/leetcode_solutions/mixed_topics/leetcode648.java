package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leetcode648 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("cat", "bat", "rat"));
        System.out.println(replaceWords(list, "the cattle was rattled by the battery"));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        HashSet<String> set = new HashSet<>(dictionary);

        for (String word : words) {
            String replacement = word;
            for (int i = 1; i <= word.length(); i++) {
                String semiRoot = word.substring(0, i);
                if (set.contains(semiRoot)) {
                    replacement = semiRoot;
                    break;
                }
            }
            sb.append(replacement).append(" ");
        }
        return sb.toString().trim();
    }
}
