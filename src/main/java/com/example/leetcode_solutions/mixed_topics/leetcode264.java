package com.example.leetcode_solutions.mixed_topics;

import java.util.HashSet;
import java.util.PriorityQueue;

public class leetcode264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(7));
    }

    public static int nthUglyNumber(int n) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();
        minHeap.add(1L);
        seen.add(1L);
        int[] factors = {2, 3, 5};
        long uglyNumber = 1;
        for (int i = 0; i < n; i++) {
            uglyNumber = minHeap.poll();
            for (int factor : factors) {
                long newUgly = uglyNumber * factor;
                if (!seen.contains(newUgly)) {
                    seen.add(newUgly);
                    minHeap.add(newUgly);
                }
            }
        }
        return (int) uglyNumber;
    }
}
