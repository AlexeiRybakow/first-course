package com.company;

import java.util.Scanner;
import java.util.Random;

public class Masivy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arr = new int[10];
        System.out.println(arr.length);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int[] arr2 = {1, 2, 3, 4, 5, 6,};
        System.out.println(arr2.length);

        String[] arr3 = {"winter", "spring", "summer", "autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr3[i]);
        }


        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr4 = new int[n];
        System.out.println("Введите эллементы массива:");
        for (int i = 0; i < n; i++) {
            arr4[i] = scanner.nextInt(); // вводим элементы массива
        }
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot = arr4[i] + tot;
            System.out.print(arr4[i] + ", "); // полученный массив
        }
        System.out.println(arr[arr4.length - 1]);// размер массива
        System.out.println();
        System.out.println("Сумма массива " + tot);


        //Пользователь вводит целое положительное число -- размер массива.
        // Массив заполняется случайными целыми числами. После этого массив выводится на экран.
        // Затем пользователь вводит целое число. Необходимо найти это число в массиве и выдать на экран его индекс.
        // Если таких чисел в массиве несколько -- выдать номер первого от начала массива элемента.
        // Если таких чисел в массиве нет -- выдать сообщение "Такого элемента в массиве нет"
        //Алгоритм линейного поиска

        System.out.println("Введите размер массива: ");
        int h = scanner.nextInt();
        int[] arr5 = new int[h];
        System.out.println("Введите эллементы массива:");
        for (int i = 0; i < h; i++) {
            arr5[i] = random.nextInt(20);
            System.out.println(arr5[i]);
        }
        int q = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] == q) {
                found = true;
                System.out.println(i);
                System.out.println("Индекс числа в массиве");
                break;
            }
        }
        if (!found) {
            System.out.println("Числа нет ! ");
        }


        // 1. Найти максимальное значение в массиве и его номер
        System.out.println("Найти максимальное значение в массиве и его номер ");
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        int[] arr6 = new int[g];
        System.out.println("Введите эллементы массива:");
        for (int i = 0; i < g; i++) {
            arr6[i] = random.nextInt(20);
            System.out.println(arr6[i]);
        }
        int bestresult = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > arr6[bestresult]) {
                bestresult = i;
            }
        }
        System.out.println("Номер лучшего результата: " + bestresult);
        System.out.println("Наилучший результат: " + arr6[bestresult]);


        // Найти минимальное значение в массиве и его номер
        System.out.println("Найти минимальное значение в массиве и его номер ");
        System.out.println("Введите размер массива: ");
        int min = scanner.nextInt();
        int[] arr7 = new int[min];
        System.out.println("Введите эллементы массива:");
        for (int i = 0; i < min; i++) {
            arr7[i] = random.nextInt(20);
            System.out.println(arr7[i]);
        }
        int badresult = arr7[0];
        for ( int i = 1; i < arr7.length; i++) {
            if ( arr7[i] < arr7[badresult] ) {
                badresult = i;
            }
        }
        System.out.println("Номер лучшего результата: " + badresult);
        System.out.println("Наименьший результат: " + arr7[badresult]);

        // Найти одновременно и максимум, и минимум в массиве за один проход цикла for
        System.out.println("Найти мин и макс значение в массиве и его номер ");
        System.out.println("Введите размер массива ");
        int m = scanner.nextInt();
        int [] arr8 = new int[m];
        System.out.println("Элементы массива: ");
        for ( int i = 0; i < m; i++) {
            arr8[i] = random.nextInt(20);
            System.out.println(arr8[i]);
        }
        int minimal = 0;
        int maximus = 0;
        for ( int i = 0; i < arr8.length; i++){
            if ( arr8[i] > arr8[maximus] ){
                maximus = i;
            }
            if ( arr8[i] < arr8[minimal] ){
                minimal = i;
            }
        }
        System.out.println("Номер лучшего результата: " + minimal);
        System.out.println("Наименьший результат: " + arr8[minimal]);
        System.out.println("Номер лучшего результата: " + maximus);
        System.out.println("Наименьший результат: " + arr8[maximus]);

    }


}

