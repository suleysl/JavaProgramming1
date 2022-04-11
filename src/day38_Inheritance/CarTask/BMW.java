package day38_Inheritance.CarTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String colour, double miles) {
        super("BMW", model, year, price, colour, miles);
    }

    public void breakdown(){
        System.out.println(brand + " " + model + " is breaking down");
    }


}
