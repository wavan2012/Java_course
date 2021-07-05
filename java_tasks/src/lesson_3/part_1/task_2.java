package lesson_3.part_1;

public class task_2 {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
     */
    public static void main(String[] args) {
        int Mas[] = new int[50];
        for (int i = 0; i < 50; i++) {
            Mas[i] = i * 2 + 1;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(Mas[i] + " ");
        }
        System.out.println();
        for (int i = 49; i > -1; i--) {
            System.out.print(Mas[i] + " ");
        }
    }
}
