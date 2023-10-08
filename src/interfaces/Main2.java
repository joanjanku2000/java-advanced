package interfaces;

public class Main2 {

    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop();
        ElectronicDevice ac = new AirConditioner();

        ac.start();
        ac.restart();
        ac.stop();


        ElectronicDevice.sayHi();
    }
}
