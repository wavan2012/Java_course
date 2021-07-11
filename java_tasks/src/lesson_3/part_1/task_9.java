package lesson_3.part_1;

import java.util.Scanner;

public class task_9 {
    /*
    Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество элементов массива: ");
        int number_of_elements = scanner.nextInt();
        if (number_of_elements > 0 & number_of_elements % 2 == 0) {
            int massive[] = new int[number_of_elements];
            int left = 0, right = 0;
            for (int i = 0; i < number_of_elements; i++) {
                massive[i] = (int) (Math.random() * 16);
                System.out.print(massive[i] + " ");
                if (i < number_of_elements / 2) left += massive[i];
                else right += massive[i];
            }
            if (right > left) System.out.println('\n' + "правая сторона больше");
            else if (left > right) System.out.println('\n' + "левая сторона больше");
            else System.out.println('\n' + "стороны равны");
        } else System.out.println('\n' + "impossible");
    }
}
