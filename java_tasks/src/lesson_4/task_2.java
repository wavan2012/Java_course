package lesson_4;

import java.util.Scanner;

public class task_2 {
    /*
Вывести нечетные элементы находящиеся под главной
диагональю(включительно)
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество элементов стороны: ");
        int number = scanner.nextInt();
        int matrix[][] = new int[number][number];
        for (int i = 0; i < number; i++)
            for (int j = 0; j < number; j++) {
                matrix[i][j] = (int) (Math.random() * 51);
            }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("нечетные элементы под главной диагональю: ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 != 0) System.out.print(matrix[i][j] + " ");
            }
        }
    }
}