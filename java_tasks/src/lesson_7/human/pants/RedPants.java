package lesson_7.human.pants;

public class RedPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Красные штаны одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Красные штаны сняты");

    }
}
