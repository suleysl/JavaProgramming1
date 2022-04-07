package day37_Inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, double price, String color) {
        super("Nokia", model, price, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }

}


/*
1.4 Create a sub class of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()
 */


