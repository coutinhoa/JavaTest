package TestJava.ExerciseThree;

public class DependencyInjection {

    /*
    Dependency Injection is a design pattern used in object-oriented programming to provide
    an object with its dependencies instead of letting it create them itself.
    Instead of a class creating everything it needs, you give it what it needs from the outside.
    This makes code easier to test, reuse, and maintain.
    */

    abstract static class Engine {
        abstract void start();
    }

    public static class ElectricEngine extends Engine{

        public void start() {
            System.out.println("Electric Engine started");
        }
    }

    public static class CombustionEngine extends Engine{

        public void start() {
            System.out.println("Combustion Engine started");
        }
    }

    public static class Car {
        private Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Car is driving...");
        }
    }

    public static void main(String[] args) {
        Engine eletricEngine = new ElectricEngine();
        Car eletricCar = new Car(eletricEngine);
        eletricCar.drive();

        Engine combustionEngine = new CombustionEngine();
        Car combustionCar = new Car(combustionEngine);
        combustionCar.drive();
    }
}
