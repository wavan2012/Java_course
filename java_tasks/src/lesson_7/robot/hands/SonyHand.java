package lesson_7.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
    }

    @Override
    public int getPrice() {
        return price;
    }
}
