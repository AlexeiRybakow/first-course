package com.company;

import java.util.Scanner;

public class FactorialFibanachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        System.out.println("Факториал числа: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println("Число Фибаначи: ");
        int z = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;

        for (int i = 1; i <= z; i++) {
            f0 = f0 + f1;
            f1 = f0 - f1;
        }
        System.out.println(f0);

    }

}
