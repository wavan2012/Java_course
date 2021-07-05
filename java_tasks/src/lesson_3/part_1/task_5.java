package lesson_3.part_1;

public class task_5 {
    /*
    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
     */
    public static void main(String[] args) {
        int Mas[] = new int[5];
        int Mas2[] = new int[5];
        System.out.print("первый массив: ");
        for (int i = 0; i < 5; i++) {
            Mas[i] = (int) (Math.random() * 15);
            Mas2[i] = (int) (Math.random() * 15);
            System.out.print(Mas[i] + " ");
        }
        System.out.print('\n' + "второй массив: ");
        int srarif = 0, srarif2 = 0;
        for (int i = 0; i < 5; i++) {
            srarif += Mas[i];
            srarif2 += Mas2[i];
            System.out.print(Mas2[i] + " ");
        }
        System.out.println('\n' + "Среднее арифметическое первого, второго: " + srarif + " " + srarif2);
        if (srarif > srarif2) System.out.println("Среднее арифметическое первого больше");
        else if (srarif < srarif2) System.out.println("Среднее арифметическое второго больше");
        else System.out.println("Среднее арифметическое первого и второго одинаковы");
    }
}
