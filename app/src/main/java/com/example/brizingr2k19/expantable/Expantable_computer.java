package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Expantable_computer {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> quizzards = new ArrayList<String>();
        quizzards.add("This is C language base quiz. Students will be evaluated on the base of basic, advanced and practical knowledge of C Language.");

        List<String> cluder = new ArrayList<String>();
        cluder.add("Clude R Quest is an event as technical treasure hunt. Team use their brain power and coding skills to solve clues (riddles). In which the clues are based on code debugging in C language, which will leads them to final round and become a winner.");


        List<String> zinger = new ArrayList<String>();
        zinger.add("This is graphic based event which includes the use of photoshop and illustrator. Participants will be provided task in three different rounds.");

        List<String> frontfest = new ArrayList<String>();
        frontfest.add("FrontFest will satisfy the hunger of a web designer. We have three levels of difficulties where participants will face several challenges related to web designing.");

        List<String> logic = new ArrayList<String>();
        logic.add("“Logic ++” is a technical event totally based on your logic skill and programming basic knowledge. There will be am individual participant, three different levels of difficulties .After completion of 3 levels, winner will be declared.");



        expandableListDetail.put("C Quizzards (Technical)", quizzards);
        expandableListDetail.put("Clude R Quest (Technical)", cluder);
        expandableListDetail.put("Creative Zinger (Technical)", zinger);
        expandableListDetail.put("Front Fest (Technical)", frontfest);
        expandableListDetail.put("Logic++ (Technical)", logic);

        return expandableListDetail;
    }
}
