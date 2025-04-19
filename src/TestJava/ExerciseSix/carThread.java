package TestJava.ExerciseSix;

public class carThread extends Thread {
    final String brand;
    final String model;
    final double price;

    public carThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void run() {
        while (true) {
            System.out.printf("hello my name is %s%n", this.brand);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new carThread("Audi", "modelAudi", 50000.00).start();
        new carThread("BMW", "modelBMW", 60000.00).start();
        System.out.println("carThreads are running...");
    }
}
