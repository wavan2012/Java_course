package lesson_2.part_2;

import java.util.Scanner;

public class task_4 {
    /*
    Составьте программу, вычисляющую A*B, не пользуясь операцией
Умножения.
     */
    public static void main(String[] args) {
        Scanner smog = new Scanner(System.in);
        System.out.print("A: ");
        Long numberA = smog.nextLong();
        System.out.print("B: ");
        Long numberB = smog.nextLong();
        int summa = 0;
        for (int i = 0; i != numberB; i++) {
            summa += numberA;
        }
        System.out.print(summa);
    }
}
