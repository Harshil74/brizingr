package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableMech {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> junkyard = new ArrayList<String>();
        junkyard.add("Event Description: \n" +
                "It is an event consisting of three rounds.\n" +
                "\n" +
                "ROUND 1 :::---\n" +
                "In the first round, you will be given a quiz paper consisting of 30 questions (MCQS).\n" +
                "All the questions are based on mechanical topics, aptitude, mathematics(EASY QUESTIONS) etc.\n" +
                "\n" +
                "ROUND 2 :::---\n" +
                "In this round , 20 teams will be selected. selected teams have to construct a structure using papers. 7 teams will be selected based accordingly load resistance, height and size of base. \n" +
                "\n" +
                " ROUND 3 :::---\n" +
                "In this round, all the raw materials are provided to you by our event coordinator, you have to prepare a SURPRISE mechanism or an assembly in the given period of time with the help of your registered team as good as possible.\n" +
                "\n" +
                "Rules and Regulation:\n" +
                "All the materials will be provided by organization. No outside materials are allowed.\n" +"\n" +
                "Judgment Criteria:\n" +
                "Anyone Faculty from the institute.\n");

        List<String> mechHunt = new ArrayList<String>();
        mechHunt.add("Event Description \n" +
                "It is a event consisting of three rounds.\n" +
                "\nROUND 1 :-\n" +
                "\n" +
                "In the first round, you will be given one Mechanical topic(like CNC, VMC, bikes, cars, engine efficiency)  which you have to discuss in group.\n" +
                "All the questions are based on mechanical topics, current affairs, etc.\n" +
                "GOOGLE SEARCH IS ALLOWED FOR 3 MINUTES BEFORE STARTING GROUP DISCUSSION.\n" +
                "\n" +
                "Round 2 :::-\n" +
                "in this round , 10 teams are selected from round 1. We will provide you picture puzzle. Picture will be given to you in form of lots of pieces of paper. Participated team have to join those pieces as fast as possible.\n" +
                "\n" +
                "Round 3 :::-\n" +
                "In this round, top 5 will be selected clues are  provided to you, you have to prepare a mechanism or an assembly in the given period of time. Participant team has to find parts of assembly by clues given to you by your event co-ordinator.\n" +
                "Winner is the First one ,who will complete assembly as earlier as possible.\n" +
                "You have to make assembly with your team.\n" +
                "\n" +
                "Rules:. \n" +
                "Cell phones must be switched off..\n" +
                "Violation of any rule may lead to your disqualification.\n" +
                "In case of any dispute, management's decision will be regarded final. \n" +
                "Participation certificate will be given to every participant.");


        List<String> lathe = new ArrayList<String>();
        lathe.add("Event Description:-\n" +
                "It is a event consisting of 3 different rounds.\n" +
                "\n" +
                "ROUND 1:---\n" +
                "We will conduct a quiz consisting 20 questions. which is mainly based on lathe machine, production method, Surface finish of material etc. \n" +
                "\n" +
                "ROUND 2:---\n" +
                "In this debate round, 10 teams will be selected. Topic will be related to Mechanical Measurements, , Manufacturing Techniques, Manufacturing Processes etc. we will allow you to internet search for 5 minutes only.\n" +
                "\n" +
                "\n" +
                "ROUND 3:---\n" +
                "In the final round, you have to prepare one job on lathe according to the drawing provided to you within given period of time.\n" +
                "Best jobs with accurate dimensions and good surface finish are selected.\n" +
                "\n" +
                "EVENT FLOW:-\n" +
                "From ROUND 1, Best 10 teams are selected.\n" +
                "From this 10 teams, in ROUND 2, Best 5 teams will qualify for the final round.\n" +
                " \n" +
                "RULES AND REGULATIONS: --\n" +
                "If any member of any team is found to be misbehaving during the event than that team will be disqualified immediately.\n" +
                "Decision taken by EVENT HEAD or COORDINATORS will be the final decision.\n" +
                "In ROUND 2, there may be the possibility of tie, so in that case those team have to play one more round to finalize the result and qualify for the next round.");

        expandableListDetail.put("Junkyard", junkyard);
        expandableListDetail.put("MechHunt", mechHunt);
        expandableListDetail.put("Lathe Master", lathe);

        return expandableListDetail;
    }
}
