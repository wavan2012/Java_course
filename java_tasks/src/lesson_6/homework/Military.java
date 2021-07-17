package lesson_6.homework;

public final class Military extends Air {
    public boolean catapultSystem;
    public int numberOfRockets;

    public void militaryCharacter() {
        System.out.printf("""
                                                
                        Марка самолета: %s
                        Масса: %s кг
                        Система катапультирования: %s
                        Количество ракет: %s
                        Мощность: %s л.с.
                        Мощность: %s кВатт
                        Максимальная скорость: %s км/ч
                        Минимальная длина взлётно-посадочной полосы : %s м
                        Размах крыльев: %s м
                                                
                        """, mark, mass,
                catapultSystem, numberOfRockets, horsePower, powerW(horsePower),
                maxSpeed, minimumRunwayLength, wingspan);
    }

    public void military() {
        if (this.numberOfRockets != 0) {
            System.out.println("Ракета пошла…");
            this.numberOfRockets--;
        } else
            System.out.println("Боеприпасы отсутствуют");
    }

    public void catapult() {
        if (this.catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
            this.numberOfRockets--;
        } else
            System.out.println("У вас нет такой системы!!!!");
    }
}

