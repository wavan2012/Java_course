package lesson_7.human;

import lesson_7.human.boots.GreenBoots;
import lesson_7.human.jackets.BlueJacket;
import lesson_7.human.jackets.GreenJacket;
import lesson_7.human.pants.GreenPants;
import lesson_7.human.pants.RedPants;

public class Run {
    public static void main(String[] args) {
        Human peter = new Human("Peter");
        peter.putOn(new GreenJacket(), new GreenPants(), new GreenBoots());
        System.out.println(peter.getName());
        peter.setName("Petia");
        peter.putOn();
        System.out.println(peter.getName());
        peter.putOff();
        peter.putOn(new BlueJacket(), new RedPants(), new GreenBoots());

    }
}
