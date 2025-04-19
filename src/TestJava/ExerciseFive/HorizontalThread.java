package TestJava.ExerciseFive;

public class HorizontalThread implements Runnable{

    private volatile boolean running = true;

    @Override
    public void run(){
        while(running) {
            double randomNumber = Math.random();
            if (randomNumber <0.5) {
                System.out.println("right...");
            } else {
                System.out.println("left...");
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                running=false;
                System.out.println(e);
            }
        }
    }

    public void stop() {
        running = false;
    }
}
