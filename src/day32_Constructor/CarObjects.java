package day32_Constructor;


public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Yaris", 2018, 17.800, "blue");

        System.out.println(car1);

        Car car2= new Car("Honda", "Accord");

        System.out.println(car2);

        Car car3= new Car("BMW", "X5", 2022);

        System.out.println(car3);

    }
}
