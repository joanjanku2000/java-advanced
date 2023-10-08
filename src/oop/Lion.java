package oop;

public class Lion extends Animal {

    public Lion() {
        super("Mammal","Lion1",5,"Years");
    }
    public Lion(String type, String name, Integer age, String ageUnit){
        super(type,name,age,ageUnit);
    }
    public void roar() {
        System.out.println("Lion is roaring");
    }

    public String toString() {
        return "Name = " + super.name + ", Age = "
                + super.age + " " + super.ageUnit + " , Type = " + super.type;
    }
}
