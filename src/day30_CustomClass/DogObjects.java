package day30_CustomClass;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

       Dog dog1 = new Dog();

       dog1.name = "Maltese";
       dog1.size= "small";
       dog1.colour= "white";
       dog1.breed= "Husky";
       dog1.age= 5;
       dog1.gender= 'F';

        System.out.println(dog1);

        Dog dog2= new Dog();

        dog2.name = "Leo";
        dog2.size= "big";
        dog2.colour= "brown";
        dog2.breed= "Saluki";
        dog2.age= 4;
        dog2.gender= 'M';

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("jack", "German Shepherd", 2, 'M', "Small", "Black");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");



        dog1.eat();

        dog2.bark();

        dog3.play();

        Dog[] dogs={dog1, dog2, dog3, dog4, dog5};

        for(Dog dog : dogs){
            System.out.println(dog);
        }

        ArrayList<Dog> femaleDogs= new ArrayList<>();

        ArrayList<Dog> maleDogs= new ArrayList<>();

        for(Dog dog : dogs){

            if(dog.gender == 'F'){
                femaleDogs.add(dog);
            }else {
                maleDogs.add(dog);
            }
        }

        System.out.println(femaleDogs);
        System.out.println(maleDogs);


    }
}
