package day32_Constructor;

public class Car {

    public String brand, modal;
    public int year;
    public double price;
    public String colour;


    public Car(String brand){
        this.brand= brand;
    }

    public Car(String brand, String modal){
        this(brand);
        this.modal= modal;
    }

    public Car(String brand, String modal, int year){
        this(brand, modal);
        this.year= year;
    }

    public Car(String brand, String modal, int year, double price){
        this(brand, modal, year);
        this.price= price;
    }

    public Car(String brand, String modal, int year, double price, String colour){
        this(brand, modal, year, price);
        this.colour= colour;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modal='" + modal + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
