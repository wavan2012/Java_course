package lesson_6.homework;

public final class Civil extends Air {
    public int numberOfPassengers;
    public boolean businessClass;

    public void civilCharacter() {
        System.out.printf("""
                        Марка самолета: %s
                        Масса: %s кг
                        Количество пассажиров: %s кг
                        Наличие бизнес класса %s
                        Мощность: %s л.с.
                        Мощность: %s кВатт
                        Максимальная скорость: %s км/ч
                        Минимальная длина взлётно-посадочной полосы : %s м
                        Размах крыльев: %s м
                                                
                        """, mark, mass,
                numberOfPassengers, businessClass, horsePower, powerW(horsePower),
                maxSpeed, minimumRunwayLength, wingspan);
    }

    public void civil(int passengers) {
        if (passengers < numberOfPassengers)
            System.out.println("Самолет загружен");
        else
            System.out.println("Вам нужен самолет побольше");
    }
}
