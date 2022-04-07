package week06;

public class PasswordCydeo {

    public static void main(String[] args) {

        String password = "Cydeo";
        char encryptWithCar = '*';
        String encryptedPassword= "";


        for (int i = 0; i < password.length(); i++) {
            // is stands for index of password string
            encryptedPassword += "" +password.charAt(i)+ encryptWithCar;// string plus char plus char = String

        }
        System.out.println("encryptedPassword = " + encryptedPassword);
    }

}






/*
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */