package Week04;

public class AdaireApartments {
    public static void main(String[] args) {


        System.out.println(" Welcome to ADAIRE APARTMENTS");

        int numberOfBedrooms= 2 ;
      double startingPrice = 2344  ;

      switch(numberOfBedrooms){
          case 0:
              System.out.println("you have selected studio apartments");
              startingPrice = 1454.0;
              break;
          case 1:
              System.out.println("You have selected one bedroom apartment");
              startingPrice= 1725.0;
              break;

          case 2:
              System.out.println("You have selected two bedroom apartment");
              startingPrice= 2300.0;

          default:
              System.out.println("NOT AVAILABLE");

      }












    }
}
