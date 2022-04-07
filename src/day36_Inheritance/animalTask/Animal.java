package day36_Inheritance.animalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String colour;


    public void setInfo(String name, String breed, char gender, String size, int age, String colour) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
