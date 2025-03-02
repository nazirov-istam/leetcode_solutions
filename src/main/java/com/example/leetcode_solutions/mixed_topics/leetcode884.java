package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode884 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list1 = Arrays.stream(s1.split(" ")).toList(),
                list2 = Arrays.stream(s2.split(" ")).toList(),
                result = new ArrayList<>();
        for (String s : list1) {
            if (Collections.frequency(list1, s) < 2) {
                if (!list2.contains(s)) {
                    result.add(s);
                }
            }
        }
        for (String s : list2) {
            if (Collections.frequency(list2, s) < 2) {
                if (!list1.contains(s)) {
                    result.add(s);
                }
            }
        }
        String[] finalResult = new String[result.size()];
        int a = 0;
        for (String s : result) {
            finalResult[a++] = s;
        }
        return finalResult;
    }
}
