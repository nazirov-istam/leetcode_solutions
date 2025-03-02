package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
            return result;
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            result.add(list);
            numRows--;
            while (numRows > 0) {
                List<Integer> list1 = new ArrayList<>();
                if (result.get(result.size() - 1).size() == 1) {
                    list1.add(1);
                    list1.add(1);
                } else {
                    for (int i = 0; i <= result.get(result.size() - 1).size(); i++) {
                        if (i == 0) {
                            list1.add(1);
                        } else if (i == result.get(result.size() - 1).size()) {
                            list1.add(1);
                        } else {
                            list1.add(result.get(result.size() - 1).get(i - 1) + result.get(result.size() - 1).get(i));
                        }
                    }
                }
                result.add(list1);
                numRows--;
            }
        }
        return result;
    }
}
