package lesson_2.part_2;

public class task_1 {
    public static void main(String[] args) {
    /*
    Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
     */
        double distance = 10;
        double summa_dis = 10;
        for (int i = 1; i < 7; i++) {
            distance +=(distance * 0.1);
            summa_dis+=distance;
        }
        System.out.println(summa_dis);
    }
}