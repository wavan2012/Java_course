package lesson_6.homework;

public class Transport {
    public static int horse_power;
    public static int max_speed;
    public static int mass;
    public static String mark;

    public static double power_w(int horse_power) {
        double power = horse_power * 0.74;
        return power;
    }
}
