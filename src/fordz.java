
import java.util.Scanner;

public class fordz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пользователь, введи число n:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // выводит одну строку
                System.out.print("*");
            }
            System.out.println(); // печатает перевод строки
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { // выводит одну строку
                System.out.print("*");
            }
            System.out.println(); // печатает перевод строки
        }

        System.out.println();

        for (int i = n; i > 1; i -= 2) {
            System.out.println(i);
        }
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = n; i > 1; i -=2) {
            for (int j = 0; j < i; j++) { // выводит одну строку
                System.out.print("*");
            }
            System.out.println(); // печатает перевод строки
        }

        for (int i = 0; i < n; i +=2) {
            for (int j = 0; j <= i; j++) { // выводит одну строку
                System.out.print("*");
            }
            System.out.println(); // печатает перевод строки
        }
            System.out.println();

        for (int i = n; i > 1; i -=2) {
            for (int j = i; j < n ; j ++){
                System.out.print("-");
            }
                for (int k = 0; k < i; k++) { // выводит одну строку
                System.out.print("*");
            }
            System.out.println(); // печатает перевод строки
        }
        for (int i = 0; i < n; i +=2) {

            }
        }
    }

