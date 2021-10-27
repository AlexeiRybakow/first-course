package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        int y = 20;

        x = -y * - 1;
        y = - 10 + x;

        System.out.println(x);
        System.out.println(y);

        int z = scanner.nextInt();
        int j = scanner.nextInt();

        z = j + z;
        j = z - j;
        z = z - j;



        System.out.println(z);
        System.out.println(j);


    }
}
