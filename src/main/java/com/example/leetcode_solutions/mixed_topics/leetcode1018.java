package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode1018 {
    public static void main(String[] args) {
        System.out.println(prefixDivBy5(new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}));
    }

    public static List<Boolean> prefixDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int checker = 0;
        for (int num : nums) {
            checker = (checker * 2 + num) % 5;
            result.add(checker == 0);
        }
        return result;
    }
}
