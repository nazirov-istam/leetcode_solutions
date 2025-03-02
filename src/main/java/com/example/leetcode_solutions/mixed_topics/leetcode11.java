package com.example.leetcode_solutions.mixed_topics;

public class leetcode11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{8, 7, 2, 1}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
