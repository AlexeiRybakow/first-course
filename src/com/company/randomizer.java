package com.company;

import java.util.Scanner;
import java.util.Random;

public class randomizer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int x = random.nextInt(100 - 1 + 1) + 1;
        System.out.println(" УГАДАЙ ЧИСЛО ");


        int n = scanner.nextInt();
        int popytki = 0;
        do {
            if (n > x) {
                System.out.println("Слишком большое число");

            } else if (n < x) {
                System.out.println("Слишком маленькое число");

            }
            popytki++;
            n = scanner.nextInt();
        }
        while (n != x);


        System.out.println("Угадал Братишка ! ");
        popytki++;
        System.out.println("Количество попыток " + popytki);

    }

}
