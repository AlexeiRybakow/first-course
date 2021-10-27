package com.company;

import java.util.Scanner;

public class recursia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int fact = 1;
        System.out.println("Факториал числа");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        int rec = factor(n);
        System.out.println("Факторила через рекурсию " + rec);


        System.out.println("Число Фибаначи: ");
        int z = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;
        for (int i = 1; i <= z; i++) {
            f0 = f0 + f1;
            f1 = f0 - f1;
        }
        System.out.println(f0);
        int fib = fibrec(z);
        System.out.println("Фибаначи через рекурсию " + fib);


        System.out.println("ЧИСЛО ПЕРЕВЕРНУТОЕ");
        int k = scanner.nextInt();
        naoborot(k);
        System.out.println("ЧИСЛО ПЕРЕВЁРНУТОЕ С УВЕЛИЧЕННЫМ РАЗРЯДОМ");
        naoboroplus(k);


    }

    static int factor(int first) {
        if (first == 0) return 1;
        return factor(first - 1) * first;
    }

    static int fibrec(int first) {
        if (first == 1 || first == 2) return 1;
        return fibrec(first - 1) + fibrec(first - 2);


    }

    static void naoborot(int one) {

        if (one == 0) return;
        int a = (one % 10);
        System.out.print(a);
        naoborot(one / 10);
    }

    static void naoboroplus(int one) {

        if (one == 0) return;
        int a = (one % 10) + 1;
        int c = a % 10;
        System.out.print(c);
        naoboroplus(one / 10);
    }

}
