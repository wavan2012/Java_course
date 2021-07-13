package lesson_4;

import java.util.Scanner;

public class task_5 {
    /*
   Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
   строкой и т. д.)
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
        System.out.println();
        int number_of_bubble;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                number_of_bubble = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = number_of_bubble;
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
