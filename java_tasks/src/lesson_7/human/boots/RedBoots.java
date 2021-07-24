package lesson_7.human.boots;

public class RedBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Красные ботинки одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Красные ботинки сняты");

    }
}
