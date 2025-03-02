package com.example.leetcode_solutions.mixed_topics;

import java.util.Arrays;

public class leetcode492 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }

    public static int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while(area%width>0){
            width--;
        }
        return new int[] {area/width,width};
    }
}
