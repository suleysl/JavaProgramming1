package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand= "Toyota";
        car1.model= "Yaris";
        car1.year= 2017;
        car1.colour= "Blue and Black";
        car1.price= 17.500;

        System.out.println(car1);

        Car car2 = new Car();

        car2.setInfo("BMW", "C16", "Blue", 2022, 21.500);

        System.out.println(car2);

        car1.drive();

        car2.park();

        // Car[] cars = { car1, car2, car3 };

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2)) ;

        for(Car each  : carsList){
            System.out.println( each.brand +" : "+each.price  );
        }

        System.out.println("------------------------------------------------------------");

        /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);









    }

}
