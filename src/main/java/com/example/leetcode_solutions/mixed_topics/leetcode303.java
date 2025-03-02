package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-1});
        System.out.println(numArray.sumRange(0, 0));
    }
}

class NumArray {
    private final List<Integer> list = new ArrayList<>();

    public NumArray(int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += list.get(i);
        }
        return result;
    }
}