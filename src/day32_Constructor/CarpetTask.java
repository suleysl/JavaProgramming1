package day32_Constructor;

public class CarpetTask {

    public double width, length, unitPrice;
    public boolean isPersian;


    public CarpetTask(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice+= 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "CarpetTask{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= £" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= £" + calcCost() +
                '}';
    }


}
