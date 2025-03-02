package com.example.leetcode_solutions.mixed_topics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Leetcode347 {
    public static void main(String[] args) {
        int[] nums = {-1, -1};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int j = 0;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int freq = 0, max = 0;
            for (Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() > freq){
                    freq = entry.getValue();
                    max = entry.getKey();
                }
            }
            map.put(max, 0);
            arr[j] = max;
            j++;
        }
        return arr;
    }
}
