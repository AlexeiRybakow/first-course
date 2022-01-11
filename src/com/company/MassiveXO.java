package com.company;
import java.util.Random;
import java.util.Scanner;

public class MassiveXO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Введите размер матрицы 1");
        int matrix1strok = scanner.nextInt();
        int matrix1stolbec = scanner.nextInt();

        int[][] arr1 = new int[matrix1strok][matrix1stolbec];

        System.out.println("Введите размер матрицы 2");
        int matrix2strokc = scanner.nextInt();
        int matrix2stolbec = scanner.nextInt();

        int[][] arr2 = new int[matrix2strokc][matrix2stolbec];

        if (matrix1stolbec == matrix2strokc) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = random.nextInt(10 - 1 + 1) + 1;
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr2[i][j] = random.nextInt(10 - 1 + 1) + 1;
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();


            }
            System.out.println();
            int[][] arr3 = new int[matrix1strok][matrix2stolbec];
            for (int i = 0; i < matrix1strok; i++) {
                for (int j = 0; j < matrix2stolbec; j++) {
                    for (int k = 0; k < matrix2strokc; k++) {
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            for (int i = 0; i < matrix1strok; i++) {
                for (int j = 0; j < matrix2stolbec; j++) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Матрицы перемножить нельзя");
        }
    }
}
