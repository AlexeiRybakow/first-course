package com.company;

import java.util.Scanner;
import java.util.Random;


public class PolovinnoeDeleniePoisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Сортировка простыми вставками

        System.out.println("Введите размер массива");
        int s = scanner.nextInt();
        int[] arr2 = new int[s];
        System.out.println("Элементы массива: ");
        for (int i = 0; i < s; i++) {
            arr2[i] = random.nextInt(100);
            System.out.println(arr2[i]);
        }

        for (int i = 1; i < arr2.length; i++) {
            int Tekushiy = arr2[i];
            int pred = i - 1;
            while (pred >= 0 && arr2[pred] > Tekushiy) {
                arr2[pred + 1] = arr2[pred];
                arr2[pred] = Tekushiy;
                pred = pred - 1;
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("Введите искомое число в массиве ");

        // Поиск половинным Делением

        int number = scanner.nextInt();
        int start = 0;
        int end = s - 1;
        int center = (end + start) / 2;
        while ((arr2[center] != number) && (start <= end)) {
            if (arr2[center] > number) {
                end = center - 1;
            } else {
                start = center + 1;
            }
            center = (end + start) / 2;
        }
        if (start <= end) {
            System.out.println(number + " является " + center + " эллементом в массиве");
        } else {
            System.out.println("Элемент не найден в массиве");
        }
    }
}
