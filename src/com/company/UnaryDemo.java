package com.company;

public class UnaryDemo {

    public static void main(String[] args) {
        int x = 40;

        int y = x++;
        System.out.println(y);

        int y2 = --x;
        System.out.println(y2);

        int y3 = ++x;
        System.out.println(y3);

        int y4 = x--;
        System.out.println(y4);

        /////////////////////////////////////////////////////////////////////////////////////////////

        int a = 52;

        int b = --a;
        System.out.println(a);

        int b2 = a--;
        System.out.println(b2);

        int b3 = a++;
        System.out.println(b3);

        int b4 = ++a;
        System.out.println(b4);
    }
}
