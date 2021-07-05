package lesson_3.part_1;

public class task_4 {
    /*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
     */
    public static void main(String[] args) {
        int Mas[] = new int[20];
        for (int i = 0; i < 20; i++) {
            Mas[i] = (int) (Math.random() * 20);
            System.out.print(Mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (Mas[i] % 2 == 0) Mas[i] = 0;
            System.out.print(Mas[i] + " ");
        }
    }
}
