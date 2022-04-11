package day38_Inheritance.CarTask;

public class Tesla extends Car {


    public Tesla(String model, int year, double price, String colour, double miles) {
        super("Tesla", model, year, price, colour, miles);
    }

    public void electricCar(){
        System.out.println(model + " " + brand + " is Electric Car");
    }




}
