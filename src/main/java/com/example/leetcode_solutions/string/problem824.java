package com.example.leetcode_solutions.string;

public class problem824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (String word : words) {
            if (word.startsWith("a") ||
                word.startsWith("e") ||
                word.startsWith("i") ||
                word.startsWith("o") ||
                word.startsWith("u") ||
                word.startsWith("A") ||
                word.startsWith("E") ||
                word.startsWith("I") ||
                word.startsWith("O") ||
                word.startsWith("U")) {
                sb.append(word).append("ma");
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            sb.append("a".repeat(counter)).append(' ');
            counter++;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
