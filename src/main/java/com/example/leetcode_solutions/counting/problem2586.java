package com.example.leetcode_solutions.counting;

public class problem2586 {
    public static void main(String[] args) {
        System.out.println(vowelStrings(
                new String[]{"are", "amy", "u"}, 0, 2
        ));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        String vowels = "aeiou";
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            if (vowels.contains(String.valueOf(words[i].charAt(0)))
                && vowels.contains(String.valueOf(words[i].charAt(words[i].length() - 1)))) {
                if (i >= left && i <= right) {
                    result++;
                }
            }
        }
        return result;
    }
}