package lesson_7.human.boots;

public class GreenBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Зеленые ботинки одеты");

    }

    @Override
    public void putOff() {
        System.out.println("Зеленые ботинки сняты");

    }
}
