package com.example.leetcode_solutions.mixed_topics;

import java.util.HashMap;

public class leetcode205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (mapST.containsKey(s.charAt(i))) {
                    if (mapST.get(s.charAt(i)) != t.charAt(i)) {
                        return false;
                    }
                } else {
                    mapST.put(s.charAt(i), t.charAt(i));
                }
                if (mapTS.containsKey(t.charAt(i))) {
                    if (mapTS.get(t.charAt(i)) != s.charAt(i)) {
                        return false;
                    }
                } else {
                    mapTS.put(t.charAt(i), s.charAt(i));
                }
            }
        }
        return true;
    }
}
