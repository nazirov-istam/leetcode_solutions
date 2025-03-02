package com.example.leetcode_solutions.mixed_topics;

import java.util.Stack;

public class leetcode907 {
    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{3, 1, 2, 4}));
    }

    public static int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        long result = 0;
        long[] dp = new long[n + 1];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[i] < arr[stack.peek()])) {
                int j = stack.pop();
                long count = (long) (i - j) * (j - (stack.isEmpty() ? -1 : stack.peek()));
                dp[j] = count % MOD * arr[j] % MOD;
                result = (result + dp[j]) % MOD;
            }
            stack.push(i);
        }

        return (int) result;
    }
}
