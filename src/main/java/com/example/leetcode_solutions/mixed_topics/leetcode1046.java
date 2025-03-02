package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.PriorityQueue;

public class leetcode1046 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 2}));
        System.out.println(lastStoneWeight2(new int[]{2, 2}));
    }

    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int stone : stones) {
            integers.add(stone);
        }
        while (integers.size() > 1) {
            Collections.sort(integers);
            if (Objects.equals(integers.get(integers.size() - 1), integers.get(integers.size() - 2))) {
                integers.remove(integers.size() - 1);
                integers.remove(integers.size() - 1);
            } else if (!Objects.equals(integers.get(integers.size() - 2), integers.get(integers.size() - 1))) {
                integers.set(integers.size() - 1, integers.get(integers.size() - 1) - integers.get(integers.size() - 2));
                integers.remove(integers.size() - 2);
            }
        }
        return integers.size() == 1 ? integers.get(0) : 0;
    }

    public static int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if (!Objects.equals(stone1, stone2)) {
                maxHeap.add(stone1 - stone2);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
