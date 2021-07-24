package lesson_7.human.jackets;

public class RedJacket implements IJackets {
    @Override
    public void putOn() {
        System.out.println("Красная куртка одета");

    }

    @Override
    public void putOff() {
        System.out.println("Красная куртка снята");

    }
}
