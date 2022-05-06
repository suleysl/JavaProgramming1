package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable {


    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }


    @Override
    public void play() {
        
    }
}
