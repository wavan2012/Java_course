package lesson_3.part_1;

public class task_7 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив
     */
    public static void main(String[] args) {
        int mass[] = new int[12];
        for (int i = 0; i < 4; i++) {
            mass[i] = (int) (Math.random() * 16);
            System.out.print(mass[i] + " ");
        }
        int max_number = mass[1], index = 1;
        for (int i = 0; i < 4; i++) {
            if (mass[i] >= max_number) {
                max_number = mass[i];
                index = i + 1;
            }
        }
        System.out.print('\n' + "Max mass[" + index + "]=" + max_number);
    }
}
