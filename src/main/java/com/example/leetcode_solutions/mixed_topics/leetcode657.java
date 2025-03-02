package com.example.leetcode_solutions.mixed_topics;

public class leetcode657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        return moves.chars().filter(ch -> ch == 'U').count() == moves.chars().filter(ch -> ch == 'D').count() &&
                moves.chars().filter(ch -> ch == 'L').count() == moves.chars().filter(ch -> ch == 'R').count();
    }
}
