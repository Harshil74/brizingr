package com.gec.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableECNon {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> ipl = new ArrayList<String>();
        ipl.add("We will check your cricket knowledge through paper quiz. Top 12 candidates will qualify for next stage and auction will be performed between these candidates. Prize money of auction is fixed. Selection of cricketer is based on credit given to the player. Final winners is based on the maximum credit collected by the team. ");

        List<String> oneorone = new ArrayList<String>();
        oneorone.add("\n" +
                "1. First round will be conducted via paper quiz in which question will be based on maths and general knowledge.\n" +
                "2. 25 candidates will be shortlist from first round.\n" +
                "3. These 25 candidates will be selected for next puzzle round.\n" +
                "4. Then 2nd round will be conducted which will consist of 2 stage.\n" +
                "5. Who will successfully clear all stage of round 2 will participate in final round.\n" +
                "6. Final round will be conducted by participation of all 10 candidates participating individually.\n" +
                "7. The final round will consist of typical problem project on screen.\n" +
                "8. In final round only by observing the problem and giving on the spot solution is allowed, calculator and rough working on paper is not allowed.\n" +
                "9. The candidates who will successfully clear all problems will be declared as winner and runner up. \n");

        List<String> unlock = new ArrayList<String>();
        unlock.add("This is group/team event.There will be three levels/rounds in the event.\n" +
                "First Round include your thinking abilities and spontaneity your quick wit, communication skill & creative imagination.       \n" +
                "Second Round is totally based on group discussion in which two teams at a time will construct a story and amicably debate that why there story is correct or right.Any one is selected. Based on their performance. \n" +
                "Final Round is mock interview & is done individual. It is totally based on  general knowledge & application of soft skills. \n");

        List<String> aubg = new ArrayList<String>();
        aubg.add("1. All the players will wear a waterproof dress.\n" +
                "2. In the centre of a gamezone 10 players will stand.\n" +
                "3. Countdown will start.\n" +
                "4. After countdown stop game is start and all the player go to find the weapon.\n" +
                "5. After finding the weapon they start attacking on each other.\n" +
                "6. After 4 minutes a warning sound is played and zone will changed\n" +
                "7. After changing the zone the player who will out of the zone is dead.\n" +
                "8. The player who declared dead have to put all the weapons inside the zone.\n" +
                "9. After changing the zone the drop will come with the sound of set.\n" +
                "10. In the drop weapons are of high range and of  better quality.\n" +
                "11. Now again after 2 minutes the zone has changed.\n" +
                "12. Final zone is announced.\n");

        expandableListDetail.put("IPL Auction", ipl);
        expandableListDetail.put("1 0r 1 = 11", oneorone);
        expandableListDetail.put("Unlock The Box", unlock);
        expandableListDetail.put("AUBG", aubg);

        return expandableListDetail;
    }
}
