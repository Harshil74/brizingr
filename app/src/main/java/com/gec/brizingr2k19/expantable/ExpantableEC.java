package com.gec.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableEC {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> kbc = new ArrayList<String>();
        kbc.add("ROUND 1  Participants  will be give basics questions (on pc).50quz\n" +
                "Question would be given in 1st round (15 minute)\n" +
                " \n" +
                "ROUND 2  in second round the participants would be given circuit based &  technical question.30quz (15 minute)\n" +
                " \n" +
                "ROUND 3 questions related to programming would be asked\n" +
                "20quz (10 minute)\n");

        List<String> wireless = new ArrayList<String>();
        wireless.add("This event based on wireless robot racing .\n" +
                "There will be three round and the participant will be selected for further round based a minimum time taken.\n" +
                "\n" +
                "Round 1 : in this robot will turn of the switch.\n" +
                " \n" +
                "Round 2 : robots have to cross the hurdles.\n" +
                " \n" +
                "Round 3 : this will be surprise for the participants.\n");


        List<String> roboPuzzle = new ArrayList<String>();
        roboPuzzle.add("ROUND 1: -PUZZLE MANIA\nParticipants have to follow the path given on the floor. The participants who clear the puzzle mania in minimum time will promoted to next round.\n" +
                "\n" +
                "ROUND 2:-\ncontestant has to clear the hurdles which are on the puzzle mania in less time and then will promote to the final round.\n" +
                "\n" +
                "ROUND 3:- (It’s a surprize Round) \nViscosity of the puzzle mania will be increase. Participant need to clear the puzzle round with minimum time consumption.\n");

        List<String> cricuit = new ArrayList<String>();
        cricuit.add("ROUND 1:\n" +
                "In this round 10 general aptitude and 10 simple electronics related questions will be given. Time provided for this round is 30 min. Participants are required to have basic knowledge of Electronics.\n" +
                "\n" +
                "ROUND 2: \n" +
                "Participants who are selected to the second round are tested on their knowledge of digital circuitry. In this round 5 digital electronics questions will be given and they are supposed to identify the faults and rectify the circuit. Time for this round is 45 min.\n" +
                "\n" +
                "ROUND 3:\n" +
                "Participants selected to this round are given a hardware circuit either digital or analog.\n");



        expandableListDetail.put("Tech KBC", kbc);
        expandableListDetail.put("Wireless Roborace", wireless);
        expandableListDetail.put("Robo Puzzle", roboPuzzle);
        expandableListDetail.put("Circuit Trix", cricuit);
        return expandableListDetail;
    }
}
