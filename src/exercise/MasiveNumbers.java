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



                if (ten == 1) {
                    result = ones[hundr] + teens[units] + orders[ord] + result;
                } else result = ones[hundr] + tens[ten] + ones[units] + orders[ord] + result;
                ord++;
            }
            System.out.println(result);
            System.out.println(ord);

        }

}
