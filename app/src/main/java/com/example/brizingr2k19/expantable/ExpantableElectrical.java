package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableElectrical {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> vollyball = new ArrayList<String>();
        vollyball.add("This event is an actual event like volleyball where there are 2 types:\n" +
                "1)Passing volleyball 2) Shooting volleyball\n" +
                "With actual rules and regulations.\n");


        List<String> ser = new ArrayList<String>();
        ser.add("You will be given clues. One clue will lead to another clue. Each clue will be hidden in the campus. Each package of clues includes next clue and piece of map. Finally collecting all pieces of map will make a full map. Using that map find the object. First team bringing that object wins.");


        expandableListDetail.put("Volleyball (Non-Technical)", vollyball);
        expandableListDetail.put("Ser Pirates (Non-Technical)", ser);

        return expandableListDetail;
    }
}
