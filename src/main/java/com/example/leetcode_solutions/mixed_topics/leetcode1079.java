package com.example.leetcode_solutions.mixed_topics;

import java.util.HashSet;
import java.util.Set;

public class leetcode1079 {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }

    public static int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, "", used, set);
        return set.size();
    }

    private static void backtrack(String tiles, String path, boolean[] used, Set<String> set) {
        if (!path.isEmpty()) {
            set.add(path);
        }

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            backtrack(tiles, path + tiles.charAt(i), used, set);
            used[i] = false;
        }
    }
}
