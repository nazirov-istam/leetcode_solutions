package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode134 {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        } else {
            int tank = 0;
            for (int i = 0; i < gas.length; i++) {
                tank += (gas[i] - cost[i]);
                if (tank < 0) {
                    start = i + 1;
                    tank = 0;
                }
            }
        }
        return start;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int start = 0, tank = 0, totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += (gas[i] - cost[i]);
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }
}
