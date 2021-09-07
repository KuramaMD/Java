package com.kurama.day_1;

public class Day_2 {
    public static void main(String[] args) {
   double x, y;
   byte b;
   int i;
   char ch;

   x = 10.1;
   y = 3.0;

   i = (int) (x / y);
        System.out.println("Integer " + i);
   i = 100;
   b = (byte) i;
        System.out.println("Value "+ b);
   i = 257;
   b = (byte) i;
        System.out.println("value of b " + b);
   b = 88;
   ch = (char) b;
        System.out.println("char " + ch);
 /*     int n, d, q;

      n = 10;
      d = 2;
      if(d != 0 && (n % d) == 0)
          System.out.println(d + " is a factor of " + n);
      d = 0;
      if(d != 0 && (n % d) == 0)
          System.out.println(d + " is a factor of " + n);
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);


        /*  int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i > j) System.out.println("i > j");
        if(i <= j) System.out.println("i <= j");
        if(i >= j) System.out.println("i >= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i == j");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("Not executed");
        if(!(b1 & b2)) System.out.println("True");
        if(b1 | b2) System.out.println("True");
        if(b1 ^ b2) System.out.println("True");

    /*     int x, y;
        x = 10;
        y = ++x;

        System.out.println(y);

/*        double distance;

        distance = 1100 * 7.2;

        System.out.println("The lightning is " + distance + " feet away");


        boolean b;

        b = false;
        System.out.println("B is " + b);
        b = true;
        System.out.println("B is " + b);

        if(b) System.out.println("Exectued");
        if(!b) System.out.println("Not executed");

        System.out.println("10 > 9 " + (10>9));
        double x, y, z;
        char ch;

        ch = 'X';

        System.out.println(ch);
        ch++;
        System.out.println(ch);
        ch = 90;
        System.out.println(ch);

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);

       // System.out.println("Hyp is " + z);

       */
    }
}
