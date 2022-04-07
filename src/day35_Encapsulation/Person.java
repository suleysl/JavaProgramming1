package day35_Encapsulation;

public class Person {


    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings, numberOfHead;


    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet = "earth";
        isHuman= true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead =1;

    }

    public static void printPlanetName(){
        System.out.println("Planet name is" + planet);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
