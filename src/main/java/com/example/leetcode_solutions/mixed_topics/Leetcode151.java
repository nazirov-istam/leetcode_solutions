package com.example.leetcode_solutions.mixed_topics;

public class Leetcode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        int left = 0, right = words.length - 1;
        while (left < right) {
            // Swap words at left and right indices
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        // Join the reversed words into a single string with a single space between them
        return String.join(" ", words);
    }
}
