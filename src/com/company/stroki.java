package com.company;
import java.util.Scanner;


public class stroki {
    public static void main(String[] args) {

        // 1.Пользователь вводит строку найти символ и вывести его

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        char ch = scanner.next().charAt(0); // чар 1ин эллемент charAT что бы 0 элемент выводил так сможет сравнивать
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == ch) {  // s.charAT(i) сравнивает поочередно каждый элемент слова
                found = true;
                System.out.println(i);
                System.out.println("Индекс числа в массиве");
                break;
            }
        }
        if (!found) {
            System.out.println("Числа нет ! ");
        }

    }
}
