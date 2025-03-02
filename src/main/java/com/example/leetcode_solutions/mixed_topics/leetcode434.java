package com.example.leetcode_solutions.mixed_topics;

public class leetcode434 {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }

    public static int countSegments(String s) {
        int segmentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }
        return segmentCount;
    }
}
