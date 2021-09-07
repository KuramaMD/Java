package com.kurama.day_1;

public class HelloWorld {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < 3) System.out.println("a is less than b");
        if(a == b) System.out.println("This won't display");
        System.out.println();

        c = a - b;

        if(c >= 0) System.out.println("C is not negative " + c);
        if(c < 0) System.out.println("C is negative " + c);
        System.out.println();

        c = b - a;
        if(c >= 0) System.out.println("C is not negative " + c);
        if(c < 0) System.out.println("C is negative " + c);

        // A java comment
    }

}
