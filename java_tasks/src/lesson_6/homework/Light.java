package lesson_6.homework;

public final class Light extends Land {
    public String body_type;
    public int number_of_passengers;


    public void lightCharacter() {
        System.out.printf("""

                        Марка автомобиля: %s
                        Тип кузова: %s
                        Масса: %s кг
                        Мощность: %s л.с.
                        Мощность: %s кВатт
                        Максимальная скорость: %s км/ч
                        Расход топлива: %s л/100км
                        Колличество пассажиров: %d
                        Колличество колёс: %d
                                                
                        """, mark, body_type, mass,
                horsePower, powerW(horsePower), maxSpeed,
                fuelConsumption, number_of_passengers, numberOfWheels);
        System.out.println();
    }


    public void light(int time_of_work) {
        double distance = time_of_work * maxSpeed;
        System.out.printf("""
                        За время %s ч, автомобиль %s
                        двигаясь с максимальной скоростью %s км/ч
                        проедет %s км и израсходует %s литров топлива.
                        """,
                time_of_work, mark, maxSpeed, distance, fuel_consume(distance));
    }

    private double fuel_consume(double distance) {
        return distance * fuelConsumption / 100;
    }
}
