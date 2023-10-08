package interfaces;

public class AirConditioner implements ElectronicDevice {
    @Override
    public void start(){
        System.out.println("Air Conditioner po ndizet...");
    }

    @Override
    public void stop(){
        System.out.println("Air Conditioner po stopon...");
    }
}
