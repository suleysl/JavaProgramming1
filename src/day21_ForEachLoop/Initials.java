package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {


        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String name : names) {
            String initial = name.charAt(0)+ "."+ name.charAt( name.indexOf(" ") +1 );
            System.out.println(initial);
            
        }

        
    }
}
