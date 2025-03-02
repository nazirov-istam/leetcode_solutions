package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int leftprod = 1;
        int rightprod = 1;

        for(int i=0;i<nums.length;i++){
            ans[i] = leftprod;
            leftprod *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = ans[i]*rightprod;
            rightprod *= nums[i];
        }
        return ans;
    }
}
