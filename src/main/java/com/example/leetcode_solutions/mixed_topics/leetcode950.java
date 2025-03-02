package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode950 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})));
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];

        boolean skip = false;
        int indexInDeck = 0, indexInResult = 0;

        Arrays.sort(deck);

        while (indexInDeck < n) {
            if (result[indexInResult] == 0) {
                if (!skip) {
                    result[indexInResult] = deck[indexInDeck];
                    indexInDeck++;
                }
                skip = !skip;
            }
            indexInResult = (indexInResult + 1) % n;
        }
        return result;
    }
}
