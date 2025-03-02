package com.example.leetcode_solutions.mixed_topics;

public class leetcode8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int index = 0, n = s.length(), sign = 1;
        long result = 0;
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        if (index == n) {
            return 0;
        }
        char currentChar = s.charAt(index);
        if (currentChar == '-' || currentChar == '+') {
            sign = (currentChar == '-') ? -1 : 1;
            index++;
        }
        while (index < n) {
            currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }
            result = result * 10 + (currentChar - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (result * sign);
    }
}
