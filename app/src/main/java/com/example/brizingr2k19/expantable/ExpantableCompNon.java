package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableCompNon {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> sher = new ArrayList<String>();
        sher.add("Round:1\n" +
                "In this round the teams will be shown a picture for few seconds and they have to\n" +
                "minutely observe the picture and then we will ask them question related to the\n" +
                "picture shown...\n" +
                "\nRound:2\n" +
                "In this round we will create a crime scene like CID and we will present an eyewitness\n" +
                "to the teams. A teams have to solve the case as per the statement given by the\n" +
                "eyewitness and at last the team which solves the case in less time will be the winner.\n" +
                "\nEvent Flow:\n" +
                "To find the Criminal\n" +
                "\n" +
                "Judgment Criteria:\n" +
                "Based to time.\n" +
                "Who take Less time they win.\n");

        List<String> hogo = new ArrayList<String>();
        hogo.add("In this non- technical game there will be 3 rounds with different Levels And Tasks. Each\n" +
                "round will be entertaining and Fully Enjoyable.\n" +
                "\n" +
                "Rules and Regulation:\n" +
                "There should be minimum 3 and Maximum 5 Participants In the group.\n" +
                "\n" +
                "Event Flow:\n" +
                "Four Team Will Participate at Same Time and Compete With Each Other. To Win they\n" +
                "have to pass Each Level of The Game. When Any of the Team Reach at The Centre\n" +
                "Circle Game Will be Finished.\n");

        List<String> lan = new ArrayList<String>();
        lan.add("This is the event for most popular LAN game NFS MOST wanted, Blur, CS source.\n" +
                "Game will be played in 3 rounds.\n");

        List<String> football = new ArrayList<String>();
        football.add("A miniature version of soccer with 5 players on each team, with 2 substitutes. Would\n" +
                "play against to score maximum goals within limited time frame. It is better known as\n" +
                "futsal.\n" +
                "Team scoring maximum goals will win.\n" +
                "A fixture of registered teams would be prepared. One against ones. And based on\n" +
                "the number of teams the tournament may take shape of a league or knockouts.\n");

        expandableListDetail.put("Sherlock Holmes (Eye Witness)", sher);
        expandableListDetail.put("Hogwards Mayanagari", hogo);
        expandableListDetail.put("Lan Gamming", lan);
        expandableListDetail.put("Urban Football", football);


        return expandableListDetail;
    }
}
