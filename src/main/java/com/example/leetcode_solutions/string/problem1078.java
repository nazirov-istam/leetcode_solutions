package com.example.leetcode_solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem1078 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOccurrences("alice is a good girl she is a good student", "a", "good")));
    }

    public static String[] findOccurrences(String text, String first, String second) {
        List<String> madeUpList = Arrays.stream(text.split(" ")).toList();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < madeUpList.size() - 2; i++) {
            if (madeUpList.get(i).equals(first) && madeUpList.get(i + 1).equals(second)) {
                result.add(madeUpList.get(i + 2));
            }
        }
        return result.toArray(new String[0]);
    }
}
