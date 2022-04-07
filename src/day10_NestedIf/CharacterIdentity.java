package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch= 65;

        if ( ch >= 48 && ch<= 57 ){
            System.out.println("digit");
        }else if ((ch >= 65 && ch <= 'Z')  || (ch >= 97 && ch <= 122 )){
            System.out.println("Alphabetic");

        }else{
            System.out.println("Special Character");
        }













    }
}
