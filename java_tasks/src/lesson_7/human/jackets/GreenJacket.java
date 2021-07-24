package lesson_7.human.jackets;

public class GreenJacket implements IJackets {
    @Override
    public void putOn() {
        System.out.println("Зеленая куртка одета");

    }

    @Override
    public void putOff() {
        System.out.println("Зеленая куртка снята");

    }
}
