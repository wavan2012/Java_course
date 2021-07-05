package lesson_1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.print("Введите сумму в белорусских рублях: ");
        Scanner scan = new Scanner(System.in);
        int byn = scan.nextInt();
        String str = String.format("В долларах: %.3f", byn / 2.51);
        System.out.print(str);
    }
}

