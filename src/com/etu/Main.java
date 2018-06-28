package com.etu;

public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        // primitives

        // byte  [1 byte]   0  {-128; 127}
        // short [2 bytes]  0  {-65536; 65535}
        // int   [4 bytes]  0  {-2^31; 2^31-1}
        // long  [8 bytes]  0  {-2^63; 2^63-1}

        // float  [4 bytes] 0.0
        // double [8 bytes] 0.0

        // char   [2 bytes] 0

        // boolean [~]      false



        // references
        //        [1 word]  null



    }
}