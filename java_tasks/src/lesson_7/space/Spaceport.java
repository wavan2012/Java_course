package lesson_7.space;

public class Spaceport {
    void launch(IStart ob) {
        ob.preLaunchCheck();
        if (!ob.preLaunchCheck())
            System.out.println("preLaunch failure");
        else {
            ob.engineLaunch();

            long startTime = System.currentTimeMillis();
            long elapsedTime = System.currentTimeMillis() - startTime;
            long elapsedSeconds = elapsedTime / 1000;
            long secondsDisplay = elapsedSeconds % 60;
            int secondsControl = 10;
            long remainder = secondsDisplay;
            while (secondsControl > 0) {
                elapsedTime = System.currentTimeMillis() - startTime;
                elapsedSeconds = elapsedTime / 1000;
                secondsDisplay = elapsedSeconds % 60;
                if (secondsDisplay != remainder) {
                    System.out.println(".." + secondsControl);
                    secondsControl--;
                    remainder = secondsDisplay;
                }
                if (secondsControl == 0) ob.start();
            }
        }
    }
}
