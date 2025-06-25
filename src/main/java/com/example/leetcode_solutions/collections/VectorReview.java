package com.example.leetcode_solutions.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorReview {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(10, 2);
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        vector.add("F");
        vector.add("G");
        vector.add("H");
        vector.add("I");
        vector.add("J");
        vector.add("K");
        System.out.println(vector.capacity());
        System.out.println(vector.size());

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Vector<String> newVector = new Vector<>(list);
        System.out.println(newVector.capacity());
        System.out.println(newVector);

        Vector<String> newVector2 = new Vector<>(vector);
        newVector2.addElement("A");
    }
}
