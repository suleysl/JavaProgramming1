package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Leo", "Saluki", 'M', "big", 5, "brown");

        dog.eat();
        dog.drink();
        dog.bark();
        dog.move();
        dog.sleep();


        Cat cat = new Cat();
        cat.setInfo("Sunny", "shorthair", 'M', "small", 2, "brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "Large", 7, "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();




    }
}
