package com.example.leetcode_solutions.mixed_topics;

public class Leetcode744 {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        char result = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int checker = Integer.MAX_VALUE;
        for (char letter : letters) {
            if (alphabet.indexOf(letter) > alphabet.indexOf(target)) {
                int i = alphabet.indexOf(letter) - alphabet.indexOf(target);
                if (checker > i) {
                    checker = i;
                    result = letter;
                }
            }
        }
        return (result != 0) ? result : letters[0];
    }
}
