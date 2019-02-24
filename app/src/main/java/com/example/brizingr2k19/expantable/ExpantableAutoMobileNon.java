package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableAutoMobileNon {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> t3s = new ArrayList<String>();
        t3s.add("In this, your trio will perform different tasks as per our theme. Each task consists different themes. There are 3 tasks a day and if you’ll perform other final 2 tasks, each participant will be given certificate consisting of 9 non-technical points. Winning team will be awarded with exclusive prize.");

        List<String> balloon = new ArrayList<String>();
        balloon.add("Round 1:\n" +
                "In this event, participated teams have to create a structure of car. Then race will be carried out. THe least time and max distance coverer will be declared winner.\n" +
                "\nRound 2:\n" +
                "The top 10 participated teams of round 1 will qualify for this round. The winner from this will be declared 1st and so on.\n");

        List<String> gully = new ArrayList<String>();
        gully.add("In this a team of 6 players will play cricket according to street cricket rules. The game will be of 6 overs. 2 teams will play against each other. Winning team will be promoted further.");

        expandableListDetail.put("T3S(The 3 Squad)", t3s);
        expandableListDetail.put("Balloon Car Racing(WATER/AIR)", balloon);
        expandableListDetail.put("Gully Cricket", gully);

        return expandableListDetail;
    }
}
