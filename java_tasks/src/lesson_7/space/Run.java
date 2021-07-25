package lesson_7.space;

public class Run {
    public static void main(String[] args) {
        Spaceport deepSpace = new Spaceport();
        Shuttle bubble = new Shuttle();
        deepSpace.launch(bubble);
    }
}
