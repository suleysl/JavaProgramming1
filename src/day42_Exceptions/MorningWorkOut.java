package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println(" push up started");


        for (int i = 0; i <= 30; i++) {
            System.out.println("pushUp " +i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();  // surround with try and catch to handle the exception
            }
        }

        System.out.println(" pushUps Completed");
    }
}
