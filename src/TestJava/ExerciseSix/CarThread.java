package TestJava.ExerciseSix;

public class CarThread implements Runnable {
    final String brand;
    final String model;
    final double price;
    private volatile boolean running = true;

    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void run() {
        while (running) {
            System.out.printf("hello my name is %s%n", this.brand);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                running= false;
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        CarThread audi = new CarThread("Audi", "modelAudi", 50000.00);
        CarThread bmw = new CarThread("BMW", "modelBMW", 60000.00);
        Thread audiThread = new Thread(audi);
        Thread bmwThread = new Thread(bmw);
        audiThread.start();
        bmwThread.start();
        System.out.println("carThreads are running...");
    }
}
