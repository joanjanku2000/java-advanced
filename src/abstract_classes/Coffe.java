package abstract_classes;

public class Coffe extends Drink {

    public Coffe(int v) {
        super(v);
    }

    public void fill(int amount){
        super.volume += amount; // super.volume = super.volume + amount
    }
}
