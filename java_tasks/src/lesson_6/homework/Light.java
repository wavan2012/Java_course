package lesson_6.homework;

public final class Light extends Land {
    public String bodyType;
    public int numberOfPassengers;


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
                                                
                        """, mark, bodyType, mass,
                horsePower, powerW(horsePower), maxSpeed,
                fuelConsumption, numberOfPassengers, numberOfWheels);
        System.out.println();
    }


    public void light(int timeOfWork) {
        double distance = timeOfWork * maxSpeed;
        System.out.printf("""
                        За время %s ч, автомобиль %s
                        двигаясь с максимальной скоростью %s км/ч
                        проедет %s км и израсходует %s литров топлива.
                        """,
                timeOfWork, mark, maxSpeed, distance, fuelConsume(distance));
    }

    private double fuelConsume(double distance) {
        return distance * fuelConsumption / 100;
    }
}
