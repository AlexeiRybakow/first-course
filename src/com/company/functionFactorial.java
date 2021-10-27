package com.company;
import java.util.Scanner;

public class functionFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение n");
        double n = scanner.nextDouble();
        System.out.println("Введите значение m");
        double m = scanner.nextDouble();

        double result = fact(n) / (fact(m) * fact(n-m));
        System.out.println(result);

    }
    static double fact(double first){
        int fact = 1;
        for (int i = 1; i <= first; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
