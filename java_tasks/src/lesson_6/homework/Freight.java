package lesson_6.homework;

public final class Freight extends Land {
    public static int lifting_capacity;

    public static void freight_character() {
        System.out.printf("\nМарка автомобиля: %s" + '\n' +
                        "Масса: %s кг" + '\n' +
                        "Грузоподъемность: %s кг" + '\n' +
                        "Мощность: %s л.с." + '\n' +
                        "Мощность: %s кВатт" + '\n' +
                        "Максимальная скорость: %s км/ч" + '\n' +
                        "Расход топлива: %s л/100км" + '\n' +
                        "Колличество колёс: %d" + '\n', mark, mass,
                lifting_capacity, horse_power, power_w(horse_power),
                max_speed, fuel_consumption, number_of_wheels);
    }
}
