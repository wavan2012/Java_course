package lesson_6.homework;

public final class Freight extends Land {
    public int liftingCapacity;

    public void freightCharacter() {
        System.out.printf("""
                                                
                        Марка автомобиля: %s
                        Масса: %s кг
                        Грузоподъемность: %s кг
                        Мощность: %s л.с.
                        Мощность: %s кВатт
                        Максимальная скорость: %s км/ч
                        Расход топлива: %s л/100км
                        Колличество колёс: %d
                                                
                        """, mark, mass,
                liftingCapacity, horsePower, powerW(horsePower),
                maxSpeed, fuelConsumption, numberOfWheels);
    }

    public void freight(double cargo) {
        if (cargo < liftingCapacity)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Вам нужен грузовик побольше");
    }
}
