package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {


        Offer offer1 = new Offer();

        offer1.setInfo("London", "Cydeo", "SDET", 100.500, true,false, true, true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("Turkey", "Google", "QA", 60.000, false, true, false, true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);


        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays. asList( myOffers )  );
        fullTimeOffers.removeIf( p -> !p.isFullTime ); // removes the offer if the offer is NOT fulltime

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList( myOffers )  );
        localOffers.removeIf( p -> !( p.location.equals("VA") || p.location.equals("CA") ) ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }



    }
}
