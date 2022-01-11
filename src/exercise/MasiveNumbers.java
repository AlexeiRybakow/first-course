package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MasiveNumbers {
    public static void main(String[] args) {

        //Пользователь вводит целое число в диапазоне от -2 млрд до 2 млрд.
        // Необходимо вывести это число на английском языке
        //87
        //eighty seven

        Scanner scanner = new Scanner(System.in);

        String[] ones = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        String[] tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        String[] teens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String hundred = "hundred";
        String[] orders = new String[]{"", "thousand", "million", "billion"
        };
        System.out.println("Введите число от -2 млрд до 2 млдр:  ");

        int numb = scanner.nextInt();
        String result = "";
        int ord = 0;
        if ( numb == 0) {
            System.out.println("Zero");
        }

        boolean minus = false;
        if ( numb < 0) {
            minus = true;
            numb = -numb;
        }

        if (numb == 0 ) {
            System.out.println("zero");
        }

        while (numb > 0) {

            int a = numb % 1000;
            int units = a % 10;
            int c = a / 10;
            int ten = c % 10;
            int hundr = c / 10;
            numb = numb / 1000;


<<<<<<< HEAD
            if (hundr >= 1 && ten == 1 ) {
                result = ones[hundr] + " " +  hundred + " " + teens[units] + " " + orders[ord] + " " + result;
            }
            else if (ten == 1) {
                result =  teens[units] + " " + orders[ord] + " " + result;
            }

            else if (hundr == 0 && ten == 0 && units == 0 ) {
                result = "" + result;
            }
            else if (hundr == 0 && ten != 0 && units != 0) {
                result = tens[ten] + " " + ones[units] + " " + orders[ord] + " " + result;
            }
            else if (hundr == 1 && ten == 0 && units == 0) {
                result = ones[hundr] + " " +  hundred + " " + orders[ord] + " " + result;
            }
            else if (hundr == 0 && ten == 0 && units != 0) {
                result = ones[units] + " " + orders[ord] + " " + result;
            }
            else if (hundr >= 1 && ten == 0 && units != 0) {
                result = ones[hundr] + " " +  hundred + " " +  ones[units] + " " + orders[ord] + " " + result;
            }
            else result = ones[hundr] + " " +  hundred + " " + tens[ten] + " " + ones[units] + " " + orders[ord] + " " + result;
=======

                if (ten == 1) {
                    result = ones[hundr] + teens[units] + orders[ord] + result;
                } else result = ones[hundr] + tens[ten] + ones[units] + orders[ord] + result;
>>>>>>> f96d96d4192c0997f40419d3a5c7e7c480dff49e
                ord++;
            }

            if (minus) {
                System.out.print("minus ");
            }
            System.out.println(result);
            System.out.println(ord);

        }

}
