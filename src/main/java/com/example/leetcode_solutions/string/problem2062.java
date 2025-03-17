package com.example.leetcode_solutions.string;

import java.util.HashSet;
import java.util.Set;

public class problem2062 {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("cuaieuouac"));
    }

    public static int countVowelSubstrings(String word) {
        int vow = 0;
        int n = word.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n - 4; i++) {
            set.clear();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    set.add(ch);
                    if (set.size() == 5)
                        vow++;
                } else
                    break;
            }
        }
        return vow;
    }
}
