package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String brand, String model, double price, String color) {
        super("Apple", model, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}
