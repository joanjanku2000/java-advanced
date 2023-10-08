package oop;


public class Animal {
    protected String type;
    protected String name;
    protected Integer age;
    protected String ageUnit;

    public Animal(String type, String name, Integer age, String ageUnit){
        this.type = type;
        this.name = name;
        this.age = age;
        this.ageUnit = ageUnit;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getAgeUnit(){
        return this.ageUnit;
    }

    public void walk(){
        System.out.println("An animal is walking");
    }


}
