package com.company;
import java.util.Scanner;
import java.util.Random;

public class PuZirSartirovkaMassiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int m = scanner.nextInt();
        int [] arr8 = new int[m];
        System.out.println("Элементы массива: ");
        for ( int i = 0; i < m; i++) {
            arr8[i] = random.nextInt(20);
            System.out.println(arr8[i]);
        }
        //     x = -y * - 1;
        //        y = - 10 + x;

        for ( int i = 0; i < arr8.length; i++) {
            for (int j = 0; j + 1 < arr8.length ; j++) {
                if (arr8[j] > arr8[j+1]){  // если поменять знак > на < то будет сортировать с макс на мин
                    int z = arr8[j+1];
                    arr8[j+1] = arr8[j];
                    arr8[j] = z;
                }
            }
        }
        System.out.println();
        for ( int i = 0; i < arr8.length; i++) {
            System.out.println(arr8[i]);
        }


        int n = scanner.nextInt();
        int [] arr1 = new int[n];
        System.out.println("Элементы массива: ");
        for ( int i = 0; i < n; i++) {
            arr1[i] = random.nextInt(20);
            System.out.println(arr1[i]);
        }
        //     x = -y * - 1;
        //        y = - 10 + x;

        for ( int i = 0; i < arr1.length; i++) {
            int badresult = i;
            for (int j = i; j < arr1.length ; j++) {
                if (arr1[j] < arr1[badresult]){  // если поменять знак > на < то будет сортировать с макс на мин
                    int z = arr1[badresult];
                    arr1[badresult] = arr1[j];
                    arr1[j]=z;
                }
            }
        }
        System.out.println();
        for ( int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    //Сортировка простыми вставками

        int s = scanner.nextInt();
        int [] arr2 = new int[s];
        System.out.println("Элементы массива: ");
        for ( int i = 0; i < s; i++) {
            arr2[i] = random.nextInt(20);
            System.out.println(arr2[i]);
        }

        for ( int i = 1; i < arr2.length; i++) {
            int Tekushiy = arr2[i];
            int pred = i -1;
                while ( pred >= 0  && arr2[pred] > Tekushiy ) {
                    arr2[pred+1]=arr2[pred];
                    arr2[pred]= Tekushiy;
                    pred = pred - 1;
                }
            }
        System.out.println();
        for ( int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            }


        // ПОИСК ПОЛОВИННЫМ ДДЕЛЕНИЕМ

        System.out.println("Посик половинным делением");

    int z = scanner.nextInt();
    int [] arr3 = new int[z];
        System.out.println("Элементы массива: ");
        for ( int i = 0; i <z; i++) {
        arr3[i] = random.nextInt(20);
        System.out.println(arr3[i]);
    }

        for ( int i = 1; i < arr3.length; i++) {
        int Tekushiy = arr3[i];
        int pred = i -1;
        while ( pred >= 0  && arr3[pred] > Tekushiy ) {
            arr3[pred+1]= arr3[pred];
            arr3[pred]= Tekushiy;
            pred = pred - 1;
        }
    }
        System.out.println("Введите искомое число");
        int isk = scanner.nextInt();

        int start = 0;
        int end = arr3.length-1;
        int center = (end - start) / 2;




}


}
