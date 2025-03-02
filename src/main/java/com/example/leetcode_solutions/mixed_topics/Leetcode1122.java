package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode1122 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = 0;
        for (int j : arr1) {
            length = Math.max(length, j);
        }
        int[] count = new int[length+1];
        for (int j : arr1) {
            count[j]++;
        }
        int[] ans = new int[arr1.length];
        int index=0;
        for (int j : arr2) {
            while (count[j] > 0) {
                ans[index] = j;
                index++;
                count[j]--;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ans[index] = i;
                index++;
                count[i]--;
            }
        }
        return ans;
    }
}
