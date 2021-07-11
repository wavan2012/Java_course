package lesson_3.part_1;

public class task_6 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int mass[] = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = (int) (Math.random() * 11);
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < 3; i++) {
            if (mass[i] >= mass[i + 1]) {
                System.out.print("не ");
                break;
            }
        }
        System.out.print("является строгой последовательностью");
    }
}
