package day38_Inheritance.CarTask;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String colour, double miles) {
        super("Toyota", model, year, price, colour, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }


}
