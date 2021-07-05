package lesson_2.part_1;

import java.util.Scanner;

public class task_5 {
    /*
    (Дополнительно) В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("количество: ");
        long programmers = sc.nextLong();
        System.out.print(programmers + " программист");
        if (programmers % 10 < 2) {
        } else if (programmers % 10 < 5)
            System.out.print("а");
        else System.out.print("ов");
    }
}
