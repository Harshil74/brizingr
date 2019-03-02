package com.gec.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableICNon {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


        List<String> almidon = new ArrayList<String>();
        almidon.add("This event is only related with the fun. In this game this mixture is made up of starch, corn and water. If the participant will Walk smoothly they will get stuck into mixture. If they jump and walk they will not get stuck and can walk on the mixture. This is how they will finish the game.");

        List<String> roboSoccer = new ArrayList<String>();
        roboSoccer.add("1st round there will be 4 robo match winners 2 will be going in the next round.\n" +
                "2nd round match of the 2 robos winner 1 goes to the last round.\n" +
                "3rd match between the 2nd round winners and final winner comes from this round.\n" +
                " \n" +
                "Robo will be provided by the event coordinator.\n" +
                "Coordinator have authority to take Final decision \n");


        List<String> think = new ArrayList<String>();
        think.add("1)Group discussion:- All the participants will be divided into groups. Each group contain 8-10 members. On the spot topic will be given to each group. Individual selection will be done.\n" +
                "2)Debet:- Selected candidate will move towards the second round. Again topic will be given to each group and participants have to put their points of view in favour or against the topic.\n" +
                "3)Elocution:- Final round. Each selected candidates have to select the topic from the bowl, 2-3 minutes will be given to recall the point, then they have to speak up for 2 minutes.\n");

        List<String> mini = new ArrayList<String>();
        mini.add("1st round kotala kud ane picking the blocks.\n" +
                "2nd  round time round in this player have to fail the glasses in minimum time and go ahead eat cucumber by using leg.");


        expandableListDetail.put("Almidon", almidon);
        expandableListDetail.put("Robo Soccer", roboSoccer);
        expandableListDetail.put("Thinking Out Loud", think);
        expandableListDetail.put("Mini Olympia", mini);


        return expandableListDetail;
    }
}
