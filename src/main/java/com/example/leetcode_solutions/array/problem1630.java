package com.example.leetcode_solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem1630 {
    public static void main(String[] args) {
        System.out.println(checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5}));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int q = l.length;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            result.add(isArithmetic(nums, l[i], r[i]));
        }
        return result;
    }

    private static boolean isArithmetic(int[] nums, int start, int end) {
        if (end - start + 1 < 2) {
            return false;
        }
        int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
        Arrays.sort(subarray);
        int difference = subarray[1] - subarray[0];
        for (int i = 2; i < subarray.length; i++) {
            if (subarray[i] - subarray[i - 1] != difference) {
                return false;
            }
        }
        return true;
    }
}
