package lesson_6.practice;

public class Bat extends Mlekop implements Echolocator {
    @Override
    public int jump() {
        System.out.println("Она летает");
        return 0;
    }

    @Override
    public void locate() {
        System.out.println("Acho");
    }
}
