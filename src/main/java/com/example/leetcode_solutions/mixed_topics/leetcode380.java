package com.example.leetcode_solutions.mixed_topics;

import java.util.*;

public class leetcode380 {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }

}

class RandomizedSet {
    private final Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<>();
    }

    public boolean insert(int val) {
        boolean result = false;
        if (!set.contains(val)) {
            set.add(val);
            result = true;
        }
        return result;
    }

    public boolean remove(int val) {
        boolean result = false;
        if (set.contains(val)) {
            set.remove(val);
            result = true;
        }
        return result;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}