package com.etu.basic;

import java.util.Arrays;
import java.util.Iterator;

public class Example9 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        Iterator<Integer> iter1 = list.iterator();
        System.out.println(iter1.hasNext());
        System.out.println(iter1.next());
        System.out.println(iter1.next());
        System.out.println(iter1.next());

        for (Integer value : list) {
            System.out.println(value);
        }


        Iterator<Integer> iter2 = list.iterator();
        System.out.println(iter2.next());

        Iterator<Integer> iter3 = list.iterator();


    }
}

class ArrayList<T> implements Iterable<T> {

    private Object[] data;
    private int current;

    public ArrayList(int size) {
        data = new Object[size];
    }

    public int size() {
        return current;
    }

    public boolean add(T element) {
        if (current == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[current++] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
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

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int curr = 0;

            @Override
            public boolean hasNext() {
                return curr != current;
            }

            @Override
            public T next() {
                return get(curr++);
            }
        };
    }
}
