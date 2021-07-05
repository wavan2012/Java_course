package lesson_2.part_2;

public class task_7 {
    /*
    Напишите программу, определяющую сумму всех нечетных чисел от 1
До 99
     */
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 1; i < 100; i += 2) {
            summa += i;
        }
        System.out.print(summa);
    }
}
