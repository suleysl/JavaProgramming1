package day32_Constructor;

public class CarpetObjects {

    public static void main(String[] args) {


        CarpetTask carpet1= new CarpetTask(3,5,8,true);
        CarpetTask carpet2 = new CarpetTask(10,20,10,false);

        System.out.println(carpet1);
        System.out.println(carpet2);

    }
}
