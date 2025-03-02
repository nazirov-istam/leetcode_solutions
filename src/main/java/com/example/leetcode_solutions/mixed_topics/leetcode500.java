package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode500 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        String[] rows = new String[]{row1, row2, row3};

        ArrayList<String> arrayList = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            for (String row : rows) {
                if (lowerWord.chars().allMatch(ch -> row.indexOf(ch) != -1)) {
                    arrayList.add(word);
                    break;
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
