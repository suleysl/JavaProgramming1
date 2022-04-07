package day37_Inheritance.animalTask;

public class Parrot extends Animal {


    public Parrot(String name, String breed, char gender, String size, int age, String colour) {
        super(name, breed, gender, size, age, colour);
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
