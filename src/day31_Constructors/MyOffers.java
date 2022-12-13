package day31_Constructors;

import day31_Constructors.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("USA", "coinbase", "QA", 150000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("UK", "bank of england", "SDET", 80000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("German", "german bank", "QA", 95000, true, false, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("Holland", "twitter", "QE", 100000, true, true, true, true);


        Offer offer5 = new Offer();
        offer5.setInfo("turkiye", "btcturk", "QA", 50000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("--------------------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffer = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffer.removeIf( p -> ! p.isFullTime );// remove if the offer is not the full times.

        System.out.println(fullTimeOffer.size());

        System.out.println("--------------------------------------------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf( p -> ! p.location.equals("turkiye") );// remove all the offer that not from local.

        System.out.println(localOffers.size());



    }
}
