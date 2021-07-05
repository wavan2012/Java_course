package lesson_2.part_2;

import java.util.Scanner;

public class task_2 {
    /*
    Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("время: ");
        long hours = sc.nextLong();
        System.out.print(hours + " часов");
        int kolvo = 1;
        for (int i = 0; i < hours / 3; i++)
            kolvo *= 2;
        System.out.print(kolvo + " амеб");
    }
}
