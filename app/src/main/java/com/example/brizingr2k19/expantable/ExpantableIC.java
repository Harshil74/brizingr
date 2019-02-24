package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableIC {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> trubo = new ArrayList<String>();
        trubo.add("In the Turbo Carting we are provide the car.Also give the safety of ride.");

        List<String> magaj = new ArrayList<String>();
        magaj.add("1st buzzer round will be comprise of 40 questions based on current scenario like sports,movies,science\n" +
                "2nd  solve the puzzle. \n" +
                "3rd there will be 4 questions open to all teams in the round 3 based on the performance result will be declared by the juries");


        List<String> robo = new ArrayList<String>();
        robo.add("1st round on the rrc\n" +
                "2nd round on the round track .\n" +
                "Result will be decided by the event co-ordinaters.\n");

        expandableListDetail.put("Turbo Carting", trubo);
        expandableListDetail.put("Magaj Manthan", magaj);
        expandableListDetail.put("Durt Robo", robo);


        return expandableListDetail;
    }
}
