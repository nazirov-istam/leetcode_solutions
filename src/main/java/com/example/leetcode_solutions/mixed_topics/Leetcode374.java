package com.example.leetcode_solutions.mixed_topics;

public class Leetcode374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    private static int guess(int num) {
        // Implementation of the guess function provided by the game
        // Returns -1 if the picked number is lower than the guessed number
        // Returns 1 if the picked number is higher than the guessed number
        // Returns 0 if the picked number is equal to the guessed number
        return 0;  // Replace this with the actual API call in your implementation
    }

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                // Guessed correctly
                return mid;
            } else if (result == -1) {
                // Picked number is higher than the guess, adjust the range
                left = mid + 1;
            } else {
                // Picked number is lower than the guess, adjust the range
                right = mid - 1;
            }
        }

        // This line should not be reached if the game is implemented correctly
        return -1;
    }
}
