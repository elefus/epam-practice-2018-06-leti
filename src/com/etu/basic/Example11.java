package com.etu.basic;

import java.util.*;
import java.util.ArrayList;

public class Example11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);
        list.add("ABC");
        list.contains("QWERTY");
        boolean doesntContain = list.remove("ASD");
        list.set(0, "QWERTY");
        list.get(0);

        List<String> linked = new LinkedList<>();

        Set<String> set = new LinkedHashSet<>();
        set.add("10");
        set.add("asdsa");
        System.out.println(set.size());

        System.out.println(set.add("10"));
        set.add("xzcx");
        System.out.println(set.size());
        for (String value : set) {
            System.out.println(value);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "abc");
        map.put(12, "abc");

        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();

        System.out.println(map.get(13));
        System.out.println(map.get(10));

        Queue<Student> students = new LinkedList<>();
        Student student = students.peek();
    }
}
