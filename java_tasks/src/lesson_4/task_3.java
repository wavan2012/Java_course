package lesson_4;

import java.util.Scanner;

public class task_3 {
    /*
Проверить произведение элементов какой диагонали больше
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
        int mult_main = 1, mult_collateral = 1;
        for (int i = 0; i < number; i++)
            mult_main *= matrix[i][i];
        for (int i = 0; i < number; i++)
            mult_collateral *= matrix[i][number - 1 - i];
        if (mult_main > mult_collateral) System.out.print("произв. эл. главн. диаг. больше");
        else if (mult_main < mult_collateral) System.out.print("произв. эл. побочн. диаг. больше");
        else System.out.print("произведения равны");
    }
}
