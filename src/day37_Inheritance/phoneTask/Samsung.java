package day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, double price, String color) {
        super("Samsung", model, price, color);
    }

    public void freeze() {
        System.out.println(brand + " " + model + " is freezing");
    }

}


/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */


