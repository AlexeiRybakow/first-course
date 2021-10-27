package com.company;

import java.util.Scanner;

public class dooo_whilee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пользователь должен ввести только нечётное число.
        //Если ввёл чётное запросить заново.

        System.out.print("Пользователь введите нечётное число: ");
        double n = 1;
        n = scanner.nextDouble();
        while (n % 2 == 0) {
            System.out.println("Пользователь вы вводите ЧЁТНОЕ ЧИСЛО, Введите НЕЧЁТНОЕ число");
            n = scanner.nextDouble();

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1 && i >= j || i + j <= n - 1 && i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        //Пользователь вводит числа до тех пор, пока не введет 0.
        // Необходимо найти произведение всех введенных чисел (кроме последнего 0)
        System.out.println();
        System.out.println("Проверка пока не введет нужное число");

        int number;
        int total = 1;

        System.out.print("Пользователь, введи число: ");
        number = scanner.nextInt();

        while (number != 0) {

            total = total * number;
            System.out.print("Пользователь, введи число другое число: ");
            number = scanner.nextInt();
        }
        System.out.println(total);
        System.out.println();

        System.out.println("СУММА ЧИСЕЛ");
        //Пользователь вводит целое положительное число. Найти сумму цифр этого число.
        // Например, пользователь вводит 123, программа должна вычислить 1 +2 + 3 и вывести 6
        System.out.println("Пользователь, введи число: ");
        int num = scanner.nextInt();
        int tot = 0;

        while (num > 0) {

            int one = num % 10;
            tot = one + tot;
            num = num / 10;
        }

        System.out.println("Сумма цифр числа: " + tot);

        //Пользователь вводит число. Необходимо подсчитать и напечатать количество цифр в этом числе

        System.out.println("КОЛИЧЕСТВО ЦИФР");

        System.out.println("Пользователь, введи число: ");
        int nume = scanner.nextInt();
        int tote = 0;

        while (nume > 0) {

            int one = nume % 10;
            int c = one % 2;
            if (c == 0) {
                c = 1;
            }
            tote = c + tote;
            nume = nume / 10;
        }

        System.out.println("Количество цифр в числое: " + tote);

    }
}
