package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String colour;
    public String size;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColour){
        name = dogName;
        breed = dogBreed;
        gender=dogGender;
        size = dogSize;
        colour=dogColour;
        age= dogAge;

    }


    public void eat(){

        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

    public void play(){
        System.out.println(name+ " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
