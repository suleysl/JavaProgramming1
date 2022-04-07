package day33_Statics;


import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {


        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student4 = new Student("Cihad", 'M', 28);

        Student student5 = new Student("Suhaib", 'M', 27, 15);

        Student student6= new Student("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);


        Student[] students = { student1, student2, student4, student5, student6};


        System.out.println(Arrays.toString(students) );




    }
}
