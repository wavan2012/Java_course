package lesson_2.part_1;

import java.util.Scanner;

public class task_4 {
    /*
    Дано целое число. Если оно является положительным, то прибавить к нему 1.
    Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
    10. Вывести полученное число.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        long number3 = sc.nextLong();
        byte positive = 0;
        if (number1 % 2 > 0) positive++;
        if (number2 % 2 > 0) positive++;
        if (number3 % 2 > 0) positive++;

        System.out.print("четных: " + positive + '\n' + "нечетных: " + (3-positive));


    }
}
