package com.example.leetcode_solutions.mixed_topics;

public class leetcode551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("ALL"));
    }

    public static boolean checkRecord(String s) {
        int count = 0;
        for (int i = 0; i < s.length() && count < 2; i++)
            if (s.charAt(i) == 'A')
                count++;
        return count < 2 && !s.contains("LLL");
    }
}
