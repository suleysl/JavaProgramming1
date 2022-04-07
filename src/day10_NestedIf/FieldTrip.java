package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location = " ";
        int numberOfGroups= 123;
        String teacher= " ";

        if(grade >=1 && grade <= 6){
            if(grade == 1){
                location = "Apple Orchard";
                numberOfGroups= 3;
                teacher= " ms Smith";
            }else if (grade ==2){
                location = " zoo " ;
                numberOfGroups= 7 ;
                teacher= "mr lee";
            }else if (grade == 3){
                location = "Aquarium";
                numberOfGroups= 5;
                teacher= " ms Wilson";
            }

        }else{
            System.out.println("Invalid Grade");

        }

        System.out.println(" location - " + location+"\n Number of Groups -" + numberOfGroups +"\n teacher in charge - " + teacher );






    }
}
