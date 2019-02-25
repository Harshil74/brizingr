package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableInvincible {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> reppeling = new ArrayList<String>();
        reppeling.add("It requires sliding across a vertical path by means of a rope and one’s security is assured by use\n" +
                "of good knotting techniques, harness and other safety equipments. There are different levels of\n" +
                "difficulties to choose from, as a beginner all one needs is an open mind and an adventurous\n" +
                "spirit.");

        List<String> zip = new ArrayList<String>();
        zip.add("A zip line consists of a pulley suspended on a cable, usually made of stainless steel, mounted\n" +
                "on a slope. It is designed to enable a person propelled by gravity to travel from the top to the\n" +
                "bottom of the inclined cable by holding on to or being attached to the freely moving pulley.");


        List<String> burma = new ArrayList<String>();
        burma.add("Burma Bridge is a fun activity for those wanting to try something new. The Burma Bridge\n" +
                "consists of a long rope bridge that has been suspended at a height. One can take the\n" +
                "adventurous walk across the bridge after wearing the safety harness.");

        List<String> monkey = new ArrayList<String>();
        monkey.add("Imagine yourself hanged by stomach on a rope at a height of 32 ft and you need to reach the\n" +
                "destination of it by strength of your hands. You will definitely feel like a Military commando while\n" +
                "doing this activity. Monkey Crawling is an adventure activity that requires strength and stamina.");

        expandableListDetail.put("Rappelling", reppeling);
        expandableListDetail.put("Ziplining", zip);
        expandableListDetail.put("Burma Bridge", burma);
        expandableListDetail.put("Monkey crawling", monkey);

        return expandableListDetail;
    }
}
