package lesson_7.human.jackets;

public class BlueJacket implements IJackets {
    @Override
    public void putOn() {
        System.out.println("Синяя куртка одета");

    }

    @Override
    public void putOff() {
        System.out.println("Синяя куртка снята");

    }
}
