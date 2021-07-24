package lesson_7.human.boots;

public class BlueBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Синие ботинки одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Синие ботинки сняты");

    }
}
