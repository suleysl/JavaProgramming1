package Week04;

public class TrafficlightSellector {
    public static void main(String[] args) {

        char colour= 'r';

        switch (colour){
            case 'R': case 'r': // or logic
                System.out.println("Red Light");
                break;

            case 'Y': case 'y':
                System.out.println("Yellow light");
              break;

            case 'G': case 'g':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid Light");
        }




    }
}
