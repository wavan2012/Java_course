package lesson_4;

import java.util.Scanner;

public class task_4 {
    /*
Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
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
        int summa = 0;
        for (int i = 1; i <= number; i++)
            for (int j = 0; j < number - i; j++)
                if (matrix[i - 1][j] % 2 == 0) summa += matrix[i - 1][j];
        System.out.println("сумма четн. элем. выше побочн. диаг.: " + summa);
    }
}
