package lesson_7.human.pants;

public class GreenPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Зеленые штаны одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Зеленые штаны сняты");

    }
}
