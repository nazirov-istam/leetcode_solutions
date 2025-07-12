package com.example.leetcode_solutions.number_theory;

public class problem858 {
    public static void main(String[] args) {
        System.out.println(mirrorReflection(3, 1));
    }

    public static int mirrorReflection(int p, int q) {
        int g = gcd(p, q);
        p /= g;
        p %= 2;
        q /= g;
        q %= 2;

        if (p == 1 && q == 1) return 1;
        return p == 1 ? 0 : 2;
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
