package com.company;
import java.util.Scanner;

public class functionfibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите порядковый номер числа Фибоначи и программа его посчитает");
        int f = scanner.nextInt();

        int result = fibonacci(f);

        System.out.println(result);


    }

    static int fibonacci(int number) {
        int f0 = 0;
        int f1 = 1;

        for (int i = 1; i <= number; i++) {
            f0 = f0 + f1;
            f1 = f0 - f1;
        }
        return f0;
    }
}
