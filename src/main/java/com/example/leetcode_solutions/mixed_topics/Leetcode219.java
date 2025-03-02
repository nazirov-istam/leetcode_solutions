package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode219 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
