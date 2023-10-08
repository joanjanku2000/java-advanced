package interfaces;

public class Laptop implements ElectronicDevice {
    @Override
    public void start() {
        System.out.println("Laptopi po ndizet");
    }

    @Override
    public void stop() {
        System.out.println("Laptopi po fiket");
    }
}
