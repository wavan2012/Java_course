package lesson_2.part_1;

import java.util.Scanner;

public class task_1 {
    /*
    В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, двухзначным или трехзначным и более.
     */
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner number = new Scanner(System.in);
        long numb = number.nextLong();
        int count = 0; long num = numb;
        while (numb != 0) { count++; numb/=10;}
        System.out.print(count +" значное ");
        if (num>0) System.out.print("положительное"); else System.out.print("отрицательное");

    }
}

