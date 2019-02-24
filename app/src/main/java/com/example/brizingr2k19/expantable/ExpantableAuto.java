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


        expandableListDetail.put("Robo Race", robo);
        expandableListDetail.put("Reverse Engineering", reverse);
        expandableListDetail.put("Life With Hydra", life);
        expandableListDetail.put("Auto Quiz", autoQuiz);

        return expandableListDetail;
    }
}
