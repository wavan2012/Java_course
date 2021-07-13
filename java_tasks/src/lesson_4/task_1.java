package lesson_4;

import java.util.Scanner;

public class task_1 {
    /*
    Посчитать сумму четных элементов стоящих на главной диагонали
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
        int summa = 0;
        for (int i = 0; i < number; i++)
            if (matrix[i][i] % 2 == 0) summa += matrix[i][i];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("сумма четных элементов диагонали: " + summa);
    }
}
