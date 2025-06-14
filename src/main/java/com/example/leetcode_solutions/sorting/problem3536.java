package com.example.leetcode_solutions.sorting;

import java.util.Arrays;

public class problem3536 {
    public static void main(String[] args) {
        System.out.println(maxProduct(31));
    }

    public static int maxProduct(int n) {
        int[] array = new int[String.valueOf(n).length()];
        int a = 0;
        while (n > 0) {
            int qoldiq = n % 10;
            array[a] = qoldiq;
            n = (n - qoldiq) / 10;
            a++;
        }
        Arrays.sort(array);
        return array[array.length-1] * array[array.length - 2];
    }
}
