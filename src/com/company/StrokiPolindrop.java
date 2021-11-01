package com.company;

import java.util.Scanner;


public class StrokiPolindrop {
    public static void main(String[] args) {

        // Проверить на полиндроп слово

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        int start = 0;
        System.out.println(start);
        int end = s.length() - 1;
        System.out.println(end);
        boolean palindrom = true;

        while (end > start) {
            while (s.charAt(start) == ' ') start++;
            while (s.charAt(end) == ' ') end--;
            if (s.charAt(end) == s.charAt(start)) {
                start++;
                end--;
            } else {
                palindrom = false;
                System.out.println("Не Палиндром");
                break;
            }
        }
        if ( palindrom) {
            System.out.println("Палиндром");
        }
    }
}
