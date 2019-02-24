package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class expantableMechNon {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> briztrivia = new ArrayList<String>();
        briztrivia.add("Description : \n" +
                "it is a quiz of different 3 rounds.Each round consists different pattern described below.\n" +
                "Each participant will be given certificate consisting of 9 Non-Technical points.\n" +
                "Winning team wil be awarded with Exclusive prizes And winning certificate.\n" +
                "\n" +
                "ROUND 1: WRITTEN WAR\n" +
                "Written war consist of written quiz test of 35 questions covering different topics (For Ex: current affairs, logical reasoning, verbal &amp; Non verbal etc.) Maximum 35 minutes will be provided to all the participants.\n" +
                "1 point will be awarded for each correct answer and 0.5 points will be deducted for each wrong answer.\n" +
                "\n" +
                "ROUND 2: FIND THE TRUTH\n" +
                "Total 10 questions will be asked among all the teams.\n" +
                "Rearrange the given letters to make a meaningful word which will be the answer of your given question.\n" +
                "20 points will be awarded for each correct answer and 10 points will be for\n" +
                "each wrong answer.\n" +
                "\n" +
                "ROUND 3: BUZZER ROUND(Final Round)\n" +
                "The type of question in this round can be anything.\n" +
                "Participant who presses the buzzer first\n" +
                "will be given the first chance to answer.20 points will be awarded for each correct answer and 10 points will be deducted for each wrong answer.\n" +
                "\n" +
                "Event flow:\n" +
                "From first round we will choose top 7 teams.which are going to play round 2.\n" +
                "From second round we will choose top 5 teams.which are going to play round 3.\n" +
                "Winning 2 Teams of final round will be awarded by exculsive prizes and winning certificate.\n" +
                "\n" +
                "Judgement Criteria:\n" +
                "All judgements are taken by event coordinators.");

        List<String> blind = new ArrayList<String>();
        blind.add("ROUND 1-;   \n" +
                "One participant of team has to blindflod theirslef.\n" +
                "They have to preform a task as follows:\n" +
                "Blind folded person has to pick up a color ball form the box and then drop that ball into specific color glass / bown placed away form the pick up box\n" +
                "\n" +
                "ROUND 2 : \n" +
                "Participant has to fill up color class with water form on place and empty the glas in another colored bucket as per color of glass \n" +
                "\n" +
                "Obstacles are present to distract this concentration.");

        List<String> sync = new ArrayList<String>();
        sync.add("This event consist of three round.\n" +
                "\n" +
                "Round 1:-DUO-RACE\n" +
                "THERE WILL BE DUO RACE IN WHICH EACH ONE\n" +
                "LEG OF PARTICIPANTS WILL BE TIE UP.TOP 10 TEAM\n" +
                "WILL BE SELECTED.\n" +
                "\nRound 2:-DUMB SHARADS\n" +
                "PARTICIPANT HAVE TO EXPLAIN CLUE GIVEN BY\n" +
                "CO-ORDINATORS.TOP 4 TEAM WILL BE SELECTED.\n" +
                "\nRound 3:-SURPRISE ROUND");


        expandableListDetail.put("Briztrivia Quiz", briztrivia);
        expandableListDetail.put("Blind Bond ", blind);
        expandableListDetail.put("Sync Buddies", sync);

        return expandableListDetail;
    }
}
