package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int a;
        a = scanner.nextInt();
        for (int i = a; i >= 0; i -= 2) {
            System.out.println(i);
        }
        for (int i = a; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }

                System.out.println();

        for (int i = a; i >= 0; i -= 2) {
            System.out.print(i + ",");

        }
                System.out.println();

        for (int i = 0; i < 10; i += 1) {
            System.out.println("*");
        }
        for (int i = 0; i < 10; i += 1) {
            System.out.print("*");
        }
    }
}
