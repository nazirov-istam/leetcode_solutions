package com.example.leetcode_solutions.enumeration;

import java.util.HashSet;
import java.util.Set;

public class problem2309 {
    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTc0dE"));
        System.out.println(greatestLetter("arRAzFif"));
        System.out.println(greatestLetter("AbCdEfGhIjK"));
    }

    public static String greatestLetter(String s) {
        for(int i='z';i>='a';i--){
            String lower=Character.toString(i);
            String upper=Character.toString(i-32);
            if(s.contains(lower)&&s.contains(upper)){
                return upper;
            }
        }
        return"";
    }
}
