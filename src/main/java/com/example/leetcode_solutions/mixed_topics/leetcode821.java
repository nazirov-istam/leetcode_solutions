package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] answer = new int[s.length()];
        int a = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        }
        int variable = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (Integer integer : list) {
                variable = Math.min(variable, Math.abs(integer - i));
            }
            answer[a++] = variable;
            variable = Integer.MAX_VALUE;
        }
        return answer;
    }
}
