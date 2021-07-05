package lesson_3.part_1;

public class task_3 {
    /*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
     */
    public static void main(String[] args) {
        int Mas[] = new int[15];
        int chetny = 0;
        for (int i = 0; i < 15; i++) {
            Mas[i] = (int) (Math.random() * 100);
            if (Mas[i] % 2 == 0) chetny++;
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(Mas[i] + " ");
        }
        System.out.println('\n' + "четных чисел: " + chetny);
    }
}
