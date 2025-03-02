package com.example.leetcode_solutions.mixed_topics;

public class leetcode520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("G"));
    }

    public static boolean detectCapitalUse(String word) {
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (word.length() == 1) {
            return true;
        } else if (capitals.contains(String.valueOf(word.charAt(0)))) {
            for (int i = 1; i < word.length(); i++) {
                if (capitals.contains(String.valueOf(word.charAt(i)))) {
                    for (int j = 2; j < word.length(); j++) {
                        if (!capitals.contains(String.valueOf(word.charAt(j)))) {
                            return false;
                        }
                    }
                } else {
                    for (int j = 2; j < word.length(); j++) {
                        if (!capitals.toLowerCase().contains(String.valueOf(word.charAt(j)))) {
                            return false;
                        }
                    }
                }
            }
        } else if (capitals.toLowerCase().contains(String.valueOf(word.charAt(0)))) {
            for (int i = 1; i < word.length(); i++) {
                if (!capitals.toLowerCase().contains(String.valueOf(word.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
