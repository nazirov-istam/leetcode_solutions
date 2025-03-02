package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public static int calPoints(String[] operations) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (String operation : operations) {
            switch (operation) {
                case "C" -> list.remove(list.size() - 1);
                case "D" -> list.add(2 * list.get(list.size() - 1));
                case "+" -> list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                default -> list.add(Integer.parseInt(operation));
            }
        }
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
}
