package abstract_classes;

public abstract class Drink {

    protected int volume;

    public Drink(int v){
        this.volume = v;
    }
    public abstract void fill(int amount);

    public int getVolume(){
       return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
