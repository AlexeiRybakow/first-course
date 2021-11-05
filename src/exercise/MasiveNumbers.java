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

        String[] ones = new String[]{
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        String[] tens = new String[]{
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        String[] teens = new String[]{
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String hundred = "hundred";
        String[] orders = new String[]{
                "", "thousand", "million", "billion"
        };


        System.out.println("Введите число от -2 млрд до 2 млдр:  ");

        int numb = scanner.nextInt();

        int qwe = 2123321432 / 1000000000;
        System.out.println(qwe);

        // проверка количества символов в числе
        int tote = 0;
        int proverka = numb;
        while (proverka > 0) {

            int one = proverka % 10;
            int c = one % 2;
            if (c == 0) {
                c = 1;
            }
            tote = c + tote;
            proverka = proverka / 10;
        }

        System.out.println("Количество цифр в числе: " + tote);

        if ( tote > 9 ) {
            int a = numb / 1000000000;
            System.out.println(a); // цифра равная количеству миллиардов
            System.out.println(ones[a] + " " + orders[3]); // присваиваем её к массиву с рукописным согласно её значение (в массиве индекс)
            int b = numb % 1000000000; // делим с остатком наше число получаем оставшуюся часть
            System.out.println(b);
            int c = b / 100000000; // цифра начала миллионов
            int d = b / 1000000; // цифры миллионов
            System.out.println(d);
            System.out.println(ones[c] + " " + hundred);
            int e = d % 100 ; // десятки и единицы миллиона
            System.out.println(e);
            int f = e / 10; // десятки миллиона
            System.out.println(f);
            System.out.println(tens[f]);
            int g = e % 10; // единицы миллиона
            System.out.println(ones[g] + " " + orders[2]);
            int h = b % 1000000; // тысячи и сотни
            System.out.println(h);
            int i = h / 1000; // остались только тысячи
            System.out.println(i);
            int j = i / 100; // разряд сотен тысяч
            System.out.println(ones[j] + " " + hundred);
            int ja = i % 100; // дестяки и единицы тысяч
            System.out.println(ja);
            int jb = ja / 10;    // десятки тысяч
            int jc = ja % 10;      // единицы тысяч
            System.out.println(tens[jb] + " " + ones[jc] + " " + orders[1]);
            int k = b % 1000;
            System.out.println(k);
            int ka = k / 100;
            System.out.println(ka);
            System.out.println(ones[ka] + " " + hundred);
            int kb = k % 100;
            System.out.println(kb);
            int kc = kb / 10;
            int kd = kb % 10;
            System.out.println(kc);
            System.out.println(kd);
            System.out.println(tens[kc] + " " + ones[kd]);

            if ( e >= 10 && e < 20 && ja >= 10 && ja <20 && kb >= 10 && kb < 20) {
                System.out.println(ones[a] + " " + orders[3]+ " " + ones[c] + " " + teens[g]+ " "
                        + " " + orders[2]+ " " + ones[j] + " " + teens[jc] + " " +
                        orders[1]+ " " + ones[ka] + " " + teens[kd] );

            }

            if ( e >= 10 && e < 20 ){
                System.out.println(ones[a] + " " + orders[3]+ " " + ones[c] + " " + teens[g]+ " "
                        + " " + orders[2]+ " " + ones[j] + " " + hundred+ " " + tens[jb] + " " + ones[jc] + " " +
                        orders[1]+ " " + ones[ka] + " " + hundred+ " " + tens[kc] + " " + ones[kd]  );
            }

            System.out.println(ones[a] + " " + orders[3]+ " " + ones[c] + " " + hundred+ " " + tens[f]+ " " + ones[g]
                    + " " + orders[2]+ " " + ones[j] + " " + hundred+ " " + tens[jb] + " " + ones[jc] + " " +
                    orders[1]+ " " + ones[ka] + " " + hundred+ " " + tens[kc] + " " + ones[kd]  ); //работает если разрял сотен != 0

        }



        // проверили условие на 2 значное
        if ( numb < 20 && numb >= 10 ) {
            int z = numb % 10;
            for (int i = 0; i < teens.length; i++) {
                if (i == z) {
                    System.out.println(teens[i]);
                }
            }

        }

        // Далее решаем остальное
        for (int i = 0; i < ones.length; i++) {
            if (i == numb) {
                System.out.println(ones[i]);
                break;
            }

        }
    }
}
