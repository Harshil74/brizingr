package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableAuto {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> robo = new ArrayList<String>();
        robo.add("The way you enter, the way you proceed, the way you reveal your speed to others begin here at the enthralling event of ‘roborace’. It provides you a track to open your enthusiasm for the rush to win with the bots. The fast speeds, tight turns and exciting collision in our hot wheels on track take place.\n" +
                "It is the event where you get to test the efficiency and power, skills of your droid/robot.\n");

        List<String> reverse = new ArrayList<String>();
        reverse.add("Reverse engineering is taking apart an object to see how it works in order to duplicate or enhance the object. The practice, taken from older industries, is now frequently used on computer hardware and software. Reverse engineering for the purpose of copyright violation.");


        List<String> life = new ArrayList<String>();
        life.add("The participants have to make a locomotive machine propelled by hydraulics, possessing a hydraulic gripping arm capable of lifting a load and placing it in a container attached to the machine. The participants have to bring their model to event. The event is divided in 2nd round. 1st round will be on 1st day of the event and final round on next day.");

        List<String> autoQuiz = new ArrayList<String>();
        autoQuiz.add(" Each team would be given a set of question paper containing 50 mcqs\n" +
                "Time limit - 25 minutes.\n" +
                "Selected teams shall appear for final round.\n" +
                "In next round, each team would be given a set of question paper containing 20 mcqs. Time limit - 10 minutes.\n" +
                "For the final buzzer round, 5 teams would be selected. 10 marks for correct answer and -5 for wrong. Time limit - 30 seconds.\n");

        List<String> t3s = new ArrayList<String>();
        t3s.add("In this, your trio will perform different tasks as per our theme. Each task consists different themes. There are 3 tasks a day and if you’ll perform other final 2 tasks, each participant will be given certificate consisting of 9 non-technical points. Winning team will be awarded with exclusive prize.");

        List<String> balloon = new ArrayList<String>();
        balloon.add("Round 1:\n" +
                "In this event, participated teams have to create a structure of car. Then race will be carried out. THe least time and max distance coverer will be declared winner.\n" +
                "\nRound 2:\n" +
                "The top 10 participated teams of round 1 will qualify for this round. The winner from this will be declared 1st and so on.\n");

        List<String> gully = new ArrayList<String>();
        gully.add("In this a team of 6 players will play cricket according to street cricket rules. The game will be of 6 overs. 2 teams will play against each other. Winning team will be promoted further.");




        expandableListDetail.put("Robo Race (Technical)", robo);
        expandableListDetail.put("Reverse Engineering (Technical)", reverse);
        expandableListDetail.put("Life With Hydra (Technical)", life);
        expandableListDetail.put("Auto Quiz (Technical)", autoQuiz);
        expandableListDetail.put("T3S(The 3 Squad) (Non-Technical)", t3s);
        expandableListDetail.put("Balloon Car Racing(WATER/AIR) (Non-Technical)", balloon);
        expandableListDetail.put("Gully Cricket (Non-Technical)", gully);

        return expandableListDetail;
    }
}
