package lesson_6.homework;

public final class Light extends Land {
    public static String body_type;
    public static int number_of_passengers;


    public static void light_character() {
        System.out.printf("\nМарка автомобиля: %s" + '\n' +
                        "Тип кузова: %s" + '\n' +
                        "Масса: %s кг" + '\n' +
                        "Мощность: %s л.с." + '\n' +
                        "Мощность: %s кВатт" + '\n' +
                        "Максимальная скорость: %s км/ч" + '\n' +
                        "Расход топлива: %s л/100км" + '\n' +
                        "Колличество пассажиров: %d" + '\n' +
                        "Колличество колёс: %d" + '\n', mark, body_type, mass,
                horse_power, power_w(horse_power), max_speed,
                fuel_consumption, number_of_passengers, number_of_wheels);
        System.out.println();
    }


    public static void light(int time_of_work) {
        double distance = time_of_work * max_speed;
        System.out.printf("За время %s ч, автомобиль %s\n" +
                        "двигаясь с максимальной скоростью %s км/ч\n" +
                        "проедет %s км и израсходует %s литров топлива.\n",
                time_of_work, mark, max_speed, distance, fuel_consume(distance));
    }

    private static double fuel_consume(double distance) {
        double fuel_consumed = distance * fuel_consumption / 100;
        return fuel_consumed;
    }
}
