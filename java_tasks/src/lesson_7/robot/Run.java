package lesson_7.robot;

import lesson_7.robot.hands.SamsungHand;
import lesson_7.robot.hands.SonyHand;
import lesson_7.robot.hands.ToshibaHand;
import lesson_7.robot.heads.SamsungHead;
import lesson_7.robot.heads.SonyHead;
import lesson_7.robot.heads.ToshibaHead;
import lesson_7.robot.legs.SamsungLeg;
import lesson_7.robot.legs.SonyLeg;
import lesson_7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot Sam = new Robot(new SamsungHead(32423), new ToshibaHand(2124), new SonyLeg(3556));
        Robot Tosh = new Robot(new ToshibaHead(33798), new SonyHand(2978), new SamsungLeg(1456));
        Robot Son = new Robot(new SonyHead(32653), new SamsungHand(1964), new ToshibaLeg(2534));
        Sam.action();
        Tosh.action();
        Son.action();
        if (Sam.getPrice() > Tosh.getPrice() & Sam.getPrice() > Son.getPrice())
            System.out.println("Sam самый дорогой");
        else if (Tosh.getPrice() > Son.getPrice())
            System.out.println("Tosh самый дорогой");
        else System.out.println("Son самый дорогой");
    }
}
