package day39_Recap.cydeoTask;

public class Tester extends Employee {


    public Tester(int age, char gender, int employeeID, String jobTitle, double salary) {
        super("Tester", age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName()+ " is creating ticket");

    }







































}
