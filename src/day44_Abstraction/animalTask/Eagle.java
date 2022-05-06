package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating worms");
    }

    @Override
    public void hunt() {

    }
}
