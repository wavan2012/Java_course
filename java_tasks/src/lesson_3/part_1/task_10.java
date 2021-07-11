package lesson_3.part_1;

import java.util.Scanner;

public class task_10 {
    /*
    Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество элементов массива: ");
        int n = scanner.nextInt();
        if (n > 3) {
            int massive[] = new int[n];
            int massive2[] = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                massive[i] = (int) (Math.random() * (n + 1));
                if (massive[i] % 2 == 0) {
                    massive2[k] = massive[i];
                    k++;
                }
                System.out.print(massive[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < k; i++) {
                System.out.print(massive2[i] + " ");
            }
        } else System.out.println('\n' + "impossible");
    }
}


