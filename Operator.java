package com.juaracoding;

public class Operator {

    public static void main(String[] args) {

        int modulus = 5 % 2;
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++; // suffix
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y; // prefix
        System.out.println(num2);

        int result = (10 + 2) * 6;
        System.out.println(result);

        // assignment
        int a = 10;
        a += 5; // a = 10 + 5
        System.out.println(a);

        // relational
        int b = 15;
        System.out.println(a == b); // 15 == 15
        System.out.println(a < b); // 15 < 15

        // bitwise
        a = 10;
        b = 12;
        System.out.println(a & b); // 1000 (biner)




    }

}
