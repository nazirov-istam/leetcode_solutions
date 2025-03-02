package com.example.leetcode_solutions.mixed_topics;

public class leetcode1175 {
    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(5));
    }

    static final int MOD = 1_000_000_007;

    public static int numPrimeArrangements(int n) {
        int primeNumbers = 0, notPrimeNumbers = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers++;
            } else {
                notPrimeNumbers++;
            }
        }
        return (int) ((factorialMod(primeNumbers) * factorialMod(notPrimeNumbers)) % MOD);
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static long factorialMod(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MOD; // Prevent overflow
        }
        return fact;
    }
}
