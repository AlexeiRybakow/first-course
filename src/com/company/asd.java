package com.company;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пользователь, введи число n:");
        int m = scanner.nextInt();


        for (int i = 0; i < m; i=i+2) {
            for (int j = i; j >= 0; j=j-2) {
                System.out.print(" ");
            }  for (int k = i; k < m ; k=k+1){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i=i+2) {
            for (int j = i; j < m ; j=j+2) {
                System.out.print(" ");
            }  for (int k = i; k < m ; k=k-1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
