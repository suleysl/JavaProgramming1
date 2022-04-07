package day35_Encapsulation.encapsulation;

public class Employee {


    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90 ){
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if( !(gender=='F' || gender=='M') ){
          return;
        }
        this.gender = gender;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
