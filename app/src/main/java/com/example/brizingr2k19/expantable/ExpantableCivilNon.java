package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableCivilNon {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();



        List<String> rodies = new ArrayList<String>();
        rodies.add("In this event participant will performed different task physical and mentally. ");

        List<String> andhadundh = new ArrayList<String>();
        andhadundh.add("In this game total 2 people participants. 1 participate blind with black patti and other one guide to first one to reach target and path. In this path six or seven obstacles i.e(benches , tires, etc) . First one participant Clear all this object with using their other partners information. Their second partner not give directly clue.He/she give information in funny style. Blindfold people using this information and clear the path and reach the finish line. ");

        List<String> dude = new ArrayList<String>();
        dude.add("Round 1: \nIn this round there will be starting and ending point participant have 2 balls. They will place the ball from starting to ending at the ending point he will throw 2 balls in the basket. After that he will give the balls to his partner at starting point and his partner will repeat the task.");



        expandableListDetail.put("Rodies ", rodies);
        expandableListDetail.put("Dude Perfect", dude);
        expandableListDetail.put("Andhadundh", andhadundh);

        return expandableListDetail;
    }
}
