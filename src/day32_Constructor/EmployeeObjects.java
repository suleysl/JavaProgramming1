package day32_Constructor;

import jdk.swing.interop.SwingInterOpUtils;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sule");

        Employee employee2= new Employee("Sule", 'F');

        Employee employee3 = new Employee("Fatih", 'M', "Chemist");

        Employee employee4= new Employee("Sema", 'F', "AQ", 90.000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }

}
