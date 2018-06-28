package com.etu;

public class Example1 {

    // fields
    private int field;
    private static int staticField = 45;

    public Example1(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public static void main(String[] args) {
        System.out.println(Example1.staticField);
        Example1.staticField = 60;
        System.out.println(Example1.staticField);

        Example1 ref1 = new Example1(42);
        System.out.println(ref1.field);

        Example1 ref2 = new Example1(80);
        System.out.println(ref2.field);

        // local variables
        int a = 50;
        double b = 70.5;
        String str = "qwerty";
        str = "xczxc";

        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int[][] arr2 = {
                {1},
                {4, 5},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < arr2[i].length; ++j) {
                System.out.println(arr2[i][j]);
            }
        }
        for (int[] row : arr2) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        try {
            System.out.println(arr2[0][0]);
        } catch (NullPointerException ex) {
            System.out.println("Exception in catch: " + ex);
        }
    }
}
