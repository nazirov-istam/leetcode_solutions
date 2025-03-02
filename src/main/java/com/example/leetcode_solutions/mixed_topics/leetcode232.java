package com.example.leetcode_solutions.mixed_topics;

import java.util.ArrayList;
import java.util.List;

public class leetcode232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());
    }

}

class MyQueue {
    private final List<Integer> list;

    public MyQueue() {
        this.list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int result = list.get(0);
        list.remove(0);
        return result;
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.isEmpty();
    }
}