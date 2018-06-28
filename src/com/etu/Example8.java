package com.etu;

import java.util.Arrays;

public class Example8 {

    public static void main(String[] args) {
        IntArrayList list = new IntArrayList(10);
        for (int i = 0; i < 11; ++i) {
            list.add(i);
        }
        System.out.println(list);
    }
}

class IntArrayList {

    private int[] data;
    private int current;

    public IntArrayList(int size) {
        data = new int[size];
    }

    public int size() {
        return current;
    }

    public boolean add(int element) {
        if (current == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[current++] = element;
        return true;
    }

    public int get(int index) {
        return data[index];
    }

    public void clear() {
        current = 0;
    }

    public void remove(int index) {
        // TODO implement
    }

    public void remove() {
        --current;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, current));
    }
}
