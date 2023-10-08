package records;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("VW","1,9 TDI",200000);
        System.out.println(car.engine());
        System.out.println(car.kms());
        System.out.println(car.model());
    }
}
