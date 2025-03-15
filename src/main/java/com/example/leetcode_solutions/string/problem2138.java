package com.example.leetcode_solutions.string;

import java.util.Arrays;

public class problem2138 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
    }

    public static String[] divideString(String s, int k, char fill) {
        int length = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        int counter = 0;
        String[] result = new String[length];
        int i;
        for (i = 0; i + k <= s.length(); i += k) {
            result[counter++] = s.substring(i, i + k);
        }
        if (i + k > s.length() && counter != length) {
            result[counter] = s.substring(i) + String.valueOf(fill).repeat(k - (s.length() - i));
        }
        return result;
    }
}
