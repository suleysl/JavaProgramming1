package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age;

    public static String schoolName= "Cydeo School";

    public static void getSchoolInfo(){    // <---- Static method
        System.out.println("School name is:" + schoolName); // <---- Static variable
    }
}
