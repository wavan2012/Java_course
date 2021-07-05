package lesson_2.part_1;

import java.util.Scanner;

public class task_2 {
    /*
    Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
Существует.
     */
    public class Main {

        public static void main(String[] args) {
            System.out.print("Введите сторону a: ");
            Scanner storona_a = new Scanner(System.in);
            long a = storona_a.nextLong();
            System.out.print("Введите сторону b: ");
            Scanner storona_b = new Scanner(System.in);
            long b = storona_b.nextLong();
            System.out.print("Введите сторону c: ");
            Scanner storona_c = new Scanner(System.in);
            long c = storona_c.nextLong();
            if (a<b+c & b<a+c & c<b+a)
                System.out. print("существует");
            else System.out. print("несуществует");
        }
    }
}
