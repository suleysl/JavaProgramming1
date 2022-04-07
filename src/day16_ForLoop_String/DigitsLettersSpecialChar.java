package day16_ForLoop_String;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {




    String str = "Cydeo123456!@£$^&%WoodenSpoon";

    String digits = " ";
    String letters = " ";
    String specialChar = " ";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i); // ch: prints each character we have in str

            if(ch >= '0' && ch<= '9'){ // if the char is between 0 - 9
                digits += ch;
            }else if( ch >= 'A' && ch <= 'Z'){ //if the char is capital A-Z
                letters += ch;
            }else if (ch >= 'a' && ch<= 'z'){
                letters += ch;
            }else {
                specialChar += ch; // Neither digit or speacial char than its a special char
            }
        }


        System.out.println(digits + letters + specialChar);
        System.out.println("specialChar = " + specialChar);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);





}

}
