package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable {

    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating cat food");
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }


    @Override
    public void play() {

    }
}
