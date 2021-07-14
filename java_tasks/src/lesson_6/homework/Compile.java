package lesson_6.homework;

public class Compile {
    public static void main(String[] args) {
        Light kopeyka = new Light();
        kopeyka.mark = "Vaz";
        kopeyka.body_type = "sedan";
        kopeyka.mass = 955;
        kopeyka.horse_power = 64;
        kopeyka.max_speed = 120;
        kopeyka.fuel_consumption = 9;
        kopeyka.number_of_passengers = 8;// it's joke
        kopeyka.number_of_wheels = 4;
        Light.light_character();
        Light.light(40);

        Freight maz500 = new Freight();
        maz500.mark = "maz";
        maz500.mass = 6500;
        maz500.horse_power = 150;
        maz500.max_speed = 120;
        maz500.number_of_wheels = 6;
        maz500.fuel_consumption = 25;
        maz500.lifting_capacity = 7500;

    }
}
