package day37_Inheritance.animalTask;


public class Cat extends Animal {


    public Cat(String name, String breed, char gender, String size, int age, String colour) {
        super(name, breed, gender, size, age, colour);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
