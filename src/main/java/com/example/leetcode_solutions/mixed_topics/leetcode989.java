package com.example.leetcode_solutions.mixed_topics;

import java.util.LinkedList;
import java.util.List;

public class leetcode989 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
