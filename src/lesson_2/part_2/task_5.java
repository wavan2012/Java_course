package lesson_2.part_2;

import java.util.Scanner;

public class task_5 {
    /*
Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        Scanner smog = new Scanner(System.in);
        System.out.print("length: ");
        Long number = smog.nextLong();
        if (0 < number & number < 21)
            System.out.print(number * 2.54);
        else System.out.print("impossible");
    }
}
