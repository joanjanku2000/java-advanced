package abstract_classes;

public class Main3 {

    public static void main(String[] args) {
        Drink drink = new Coffe(3);
        drink.fill(4);
        Drink drink2 = new Coffe(1);
        drink2.fill(9);
        System.out.println(drink.getVolume());
    }
}
