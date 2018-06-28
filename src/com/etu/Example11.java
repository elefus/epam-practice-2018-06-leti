package com.etu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);
        list.add("ABC");
        list.contains("QWERTY");
        boolean doesntContain = list.remove("ASD");
        list.set(0, "QWERTY");
        list.get(0);

        List<String> linked = new LinkedList<>();

    }
}
