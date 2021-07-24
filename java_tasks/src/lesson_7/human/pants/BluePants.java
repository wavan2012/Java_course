package lesson_7.human.pants;

public class BluePants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Синие штаны одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Синие штаны сняты");

    }
}
