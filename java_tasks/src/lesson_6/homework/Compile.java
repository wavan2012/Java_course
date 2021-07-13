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



                /*
                body_type, mass,
        horse_power, super.power_w(horse_power), max_speed,
        fuel_consumption, number_of_passengers, number_of_wheels
                 */
    }
}
