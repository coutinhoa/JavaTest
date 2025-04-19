package TestJava.ExerciseFive;

import java.io.IOException;

public class Robot {
    HorizontalThread horizontal = new HorizontalThread();
    VerticalThread vertical = new VerticalThread();

    public Robot(){
        this.horizontal = new HorizontalThread();
        this.vertical = new VerticalThread();
    }

    public void startMoving() {
        Thread t1 = new Thread(horizontal);
        Thread t2 = new Thread(vertical);
        t1.start();
        t2.start();
    }

    public void stopMoving(){
        horizontal.stop();
        vertical.stop();
        System.out.println("Stopping robot...");
    }

    public static void main(String[] args) throws InterruptedException {
        Robot robot = new Robot();
        robot.startMoving();

        Thread.sleep(3000);

        robot.stopMoving();
    }
}
