package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode1002 {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
    }

    public static List<String> commonChars(String[] words) {
        int n = words.length, j;
        int[][] freq = new int[n - 1][26];
        for (int i = 1; i < n; i++)
            for (char c : words[i].toCharArray())
                freq[i - 1][c - 'a']++;
        List<String> res = new ArrayList<>();
        for (char c : words[0].toCharArray()) {
            for (j = 1; j < n; j++) {
                if (freq[j - 1][c - 'a'] > 0)
                    freq[j - 1][c - 'a']--;
                else
                    break;
            }
            if (j == n)
                res.add(c + "");
        }
        return res;
    }
}
