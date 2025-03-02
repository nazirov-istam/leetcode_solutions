package com.example.leetcode_solutions.mixed_topics;

public class leetcode1185 {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31,8,2019));
    }
    public static String dayOfTheWeek(int day, int month, int year) {
        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3)
            year--;
        int n = (year + year / 4 - year / 100 + year / 400 + t[month - 1]+ day) % 7;
        String[]arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return arr[n];
    }
}
