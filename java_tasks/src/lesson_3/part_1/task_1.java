package lesson_3.part_1;

public class task_1 {
    /*
)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементымассива на
экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
     */
    public static void main(String[] args) {
        int Mas[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Mas[i] = (i + 1) * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(Mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(Mas[i]);
        }
    }
}
