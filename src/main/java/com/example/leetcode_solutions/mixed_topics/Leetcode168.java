package com.example.leetcode_solutions.mixed_topics;

public class Leetcode168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // Subtract 1 to handle zero-based indexing

            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            sb.insert(0, letter); // Insert letter at the beginning of StringBuilder

            columnNumber /= 26;
        }

        return sb.toString();
    }
}
