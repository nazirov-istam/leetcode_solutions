package com.example.leetcode_solutions.mixed_topics;

public class Leetcode443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',}));
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();

        int freq = 1;

        for (int i = 0; i < n; i++) {
            char c = chars[i];

            while (i < n - 1 && chars[i] == chars[i + 1]) {
                freq++;
                i++;
            }

            sb.append(c);

            if (freq > 1) {
                sb.append(freq);
            }

            freq = 1;
        }

        String compressedStr = sb.toString();
        char[] compressedChars = compressedStr.toCharArray();

        for (int i = 0; i < compressedChars.length; i++) {
            chars[i] = compressedChars[i];
        }

        return compressedChars.length;
    }
}
