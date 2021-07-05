package lesson_2.part_2;

public class task_3 {
    /*
    Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int kolvo = 1, summa = 0;
        do
        { summa += kolvo;
            kolvo *= 2;} while (kolvo < 257);
        System.out.print(summa);
    }
}
