package lesson_3.part_1;

import java.math.BigDecimal;

public class task_8 {
    /*
    Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
     */
    public static void main(String[] args) {
        int Mas[] = new int[10];
        double Mas2[] = new double[10];
        double Mas3[] = new double[10];
        System.out.print("первый массив: ");
        for (int i = 0; i < 10; i++) {
            Mas[i] = (int) (Math.random() * 9 + 1);
            Mas2[i] = (int) (Math.random() * 9 + 1);
            Mas3[i] = Mas[i] / Mas2[i];
            System.out.print(Mas[i] + "       ");
        }
        System.out.print('\n' + "второй массив: ");
        int number_of_integer = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(Mas2[i] + "     ");
            if (Mas3[i] - (int) Mas3[i] == 0.0) number_of_integer++;
        }
        System.out.print('\n' + "третий массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.5f ", Mas3[i]);
        }
        System.out.println('\n' + "Количество целых чисел в третьем массиве: " + number_of_integer);
    }
}

