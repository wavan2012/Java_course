package lesson_4;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int winner = 0, player = 1;
        while (winner == 0) {
            if (player == 1) System.out.print("          (0_0)ПЕРВЫЙ ИГРОК(0_0)\n");
            else System.out.print("          (X_X)ВТОРОЙ ИГРОК(X_X)\n");
            System.out.print("X: ");
            int matrix_X = scanner.nextInt() - 1;
            System.out.print("Y: ");
            int matrix_Y = scanner.nextInt() - 1;
            System.out.println();
            if (player == 1 & matrix[matrix_X][matrix_Y] != 1 & matrix[matrix_X][matrix_Y] != 2)
                matrix[matrix_X][matrix_Y] = 1;
            else if (player == 2 & matrix[matrix_X][matrix_Y] != 1 & matrix[matrix_X][matrix_Y] != 2)
                matrix[matrix_X][matrix_Y] = 2;
            else {
                System.out.println("занято");
                if (player == 1) player++;
                else player--;
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    if (matrix[j][i] == 1)
                        System.out.print("O ");
                    else if (matrix[j][i] == 2)
                        System.out.print("X ");
                    else System.out.print("_ ");
                System.out.println();
            }


            for (int i = 0; i < 3; i++) {
                if ((matrix[i][0] == player & matrix[i][1] == player & matrix[i][2] == player)
                        || (matrix[0][i] == player & matrix[1][i] == player & matrix[2][i] == player)
                        || (matrix[0][0] == player & matrix[1][1] == player & matrix[2][2] == player)
                        || (matrix[2][0] == player & matrix[1][1] == player & matrix[0][2] == player))

                    winner = player;
                else if (player == 1) player++;
                else player--;
            }
        }
        System.out.print("Игрок №" + winner + " ПОБЕДИТЕЛЬ!!!");
    }
}

