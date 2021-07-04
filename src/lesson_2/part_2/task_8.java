package lesson_2.part_2;

import java.util.Scanner;

public class task_8 {
    /*
нарисовать оставшиеся 2 треугольника
*
* *
* * *
* * * *

* * * *
* * *
* *
*
     */
    public static void main(String[] args) {
        Scanner smog = new Scanner(System.in);
        System.out.print("length: ");
        int number = smog.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
        for (int i = number; i != 0; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
