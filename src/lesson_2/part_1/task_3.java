package lesson_2.part_1;

import java.util.Scanner;

public class task_3 {
    /*
    Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.
     */
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner number = new Scanner(System.in);
        long numb = number.nextLong();
        if (numb>0) System.out.print(numb+1);
        if (numb<0) System.out.print(numb-2);
        if (numb==0) {numb=10; System.out.print(numb);}
    }
}
