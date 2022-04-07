package day24_CustomMethod_return;

import java.util.Locale;

public class warmUpTasks {


    public static void main(String[] args) {
        initialOfPerson("wooden", "spoon");
        System.out.println("____________________________");

        emailDomain("Cydeo.school@gmail.com");

        System.out.println("_____________________________________________");

        String [] emails = {"Josh@gmail.com" , "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            emailDomain(email);

        }
        System.out.println("______________________________________________");

        nameOfMonth(7);

        System.out.println("______________________________________________");

        nameOfDay(5);

    }

    public static void initialOfPerson(String firstName , String lastName){

        String initial = firstName.charAt(0)+ "." +lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    public static void emailDomain(String email){
        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf(".") );
        System.out.println(domain);
    }

    public static void nameOfMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12){
            name = (number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                    :(number==9)?"Sept":(number==10)?"October":(number==11)?"Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }

    public static void nameOfDay(int number){

        String name= " ";

        if (number >= 1 && number <= 7){
            name = (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wed":(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday" : "Sunday";

        }else {
            name = "Invalid";
        }

        System.out.println("Name of the day = " + name);

    }


















}

