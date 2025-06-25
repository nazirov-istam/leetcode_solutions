package com.example.leetcode_solutions.collections;

import java.util.Stack;

public class StackReview {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("A");
        strings.push("B");
        strings.push("C");
        System.out.println(strings.pop());
        System.out.println(strings);
        System.out.println(strings.push("D"));
        System.out.println(strings);
        System.out.println(strings.search("J"));
        System.out.println(strings.search("D"));
    }
}
