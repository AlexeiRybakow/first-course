package com.company;

import java.util.Random;
import java.util.Scanner;

public class MassivyTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int s = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] arr1 = new int[s][q];

        Random rnd = new Random();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rnd.nextInt(-1 - (-100) + 1) - 100;
            }
        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        int maxstroki = 0;



        for (int i = 0; i < arr1.length; i++) {

            int summstroki = 0;


            for (int k = 0; k < arr1[i].length; k++) {
                summstroki += arr1[i][k];

            }
            if (summstroki > maxstroki) {
                maxstroki = summstroki;
            }
            System.out.println(summstroki);
            System.out.println(maxstroki);
        }




        System.out.println();
        int[] total = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            for (int k = 0; k < arr1[i].length; k++) {

                total[i] += arr1[i][k];
            }
        }

        for (int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
        int bestresult = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > total[bestresult]) {
                bestresult = i;
            }
        }
        System.out.println("Номер лучшего результата: " + bestresult);
        System.out.println("Наилучший результат: " + total[bestresult]);
    }

}
