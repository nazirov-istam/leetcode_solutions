package com.example.leetcode_solutions.string;

import java.util.HashMap;

public class problem748 {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String numbers = "1234567890";
        HashMap<Character, Integer> licenseMap = new HashMap<>();

        for (char c : licensePlate.toCharArray()) {
            if (!numbers.contains(String.valueOf(c)) && c != ' ') {
                char lowerCase = Character.toLowerCase(c);
                licenseMap.put(lowerCase, licenseMap.getOrDefault(lowerCase, 0) + 1);
            }
        }

        String shortestWord = null;

        for (String word : words) {
            if (isCompletingWord(word, licenseMap)) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }

    private static boolean isCompletingWord(String word, HashMap<Character, Integer> licenseMap) {
        HashMap<Character, Integer> wordMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            char lowerCase = Character.toLowerCase(c);
            wordMap.put(lowerCase, wordMap.getOrDefault(lowerCase, 0) + 1);
        }

        for (char key : licenseMap.keySet()) {
            if (wordMap.getOrDefault(key, 0) < licenseMap.get(key)) {
                return false;
            }
        }

        return true;
    }

}
