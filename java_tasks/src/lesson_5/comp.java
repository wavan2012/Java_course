package lesson_5;

import java.util.Scanner;

public class comp {
    public static String processor;
    public static String operative;
    public static String hard;
    public static int cycles;
    public static int active = 0;

    public static void Console() {
        int i = 0;
        while (i == 0) {
            System.out.print("Напишите команду: ");
            Scanner scan = new Scanner(System.in);
            String command = scan.nextLine();
            if (command.equals("stop")) break;
            if (command.equals("desc")) description();
            if (command.equals("turn")) if (active == 0) turn_on();
            else turn_off();
            if (command.equals("turn on")) turn_on();
            if (command.equals("turn off")) turn_off();
            if (command.equals("comp")) comp();
        }
    }

    public static void comp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите Процессор: ");
        processor = scan.nextLine();
        System.out.println("Напишите Оперативную память: ");
        operative = scan.nextLine();
        System.out.println("Жесткий диск: ");
        hard = scan.nextLine();
        System.out.println("Жизненный цикл: ");
        cycles = scan.nextInt();
    }

    static void description() {
        System.out.println("Процессор: " + processor + '\n' +
                "Оперативная память: " + operative + '\n' +
                "Жесткий диск: " + hard + '\n' +
                "Жизненный цикл: " + cycles);
    }

    public static void turn_on() {
        Scanner scan = new Scanner(System.in);
        if (cycles != 0 & active != 1) {
            if ((int) (Math.random() * 15) == 7) {
                System.out.print("dont_crash: ");
                int dont_crush_number = scan.nextInt();
                if ((int) (Math.random() * 2) == dont_crush_number) {
                    turn_off();
                } else {
                    active = 0;
                    cycles = 0;
                    System.out.println("Потрачено");
                }
            } else {
                active = 1;
                System.out.println("Активен");
            }
        } else {
            System.out.println("impossible");
        }
    }

    public static void turn_off() {
        Scanner scan = new Scanner(System.in);
        if (cycles != 0 & active != 0) {
            if ((int) (Math.random() * 15) == 7) {
                System.out.print("dont_crash: ");
                int dont_crush_number = scan.nextInt();
                if ((int) (Math.random() * 2) == dont_crush_number) {
                    active = 0;
                    cycles--;
                    System.out.println("НеАктивен");
                } else {
                    cycles = 0;
                    System.out.println("Потрачено");
                }
            } else {
                active = 0;
                System.out.println("НеАктивен");
            }
        } else {
            System.out.println("impossible");
        }
    }
}
