package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableCivil {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> straw = new ArrayList<String>();
        straw.add("Round 1\n" +
                "In this event, participated teams have to create a structure of two storey building by using given material from our side and participated teams must be design that structure by using straw and tap then it will be tested for its load carrying capacity.\n" +
                "\nRound 2\n" +
                "The top 10 teams from the 1st round will be selected for this round. The details will be given by co-ordinators of this event on that day.\n");

        List<String> quizo = new ArrayList<String>();
        quizo.add("In this event the participants have to give answers of mcq type questions on paper. The participant scoring highest marks will be the winner.");


        List<String> civilHunt = new ArrayList<String>();
        civilHunt.add("As the name suggests in this event one will provided with a chit on which there will be a clue to reach to the another chit. The second chit is the first piece of puzzle on which there is the clue to reach to the another chit. Similarly there are another three chits and at last the last four chits combine forms an plan. The student has to bring the plan formed after combining the chits to coordinator. At the end the student will provided with an A4 size sheet, pencil,and ruler scale. With the help of team mates the student has to made that same plan on the scale which will be given by us with label. Whose plan is perfect with labeled and can answer all the question related to his/her plan is the winner.");

        List<String> aqua = new ArrayList<String>();
        aqua.add("The tech event is divided in two rounds 1.) Water bottle Rockets, 2.) Earthquake load bearing structure. First round is Related to fluid mechanics and projectile motion. Second Round is related to knowledge of structure and earthquake Effect on structure. Round-1: Water bottle rocket. Participant will be provided a plastic bottle, cutter and a nozzle, sealant, pump and water. They will have to fit nozzle in cap of bottle and seal it with sealant. Then they will water in the bottle, then close the bottle and fill air in it with pump, your water rocket is ready to launch. Round-2: Earthquake load bearing structure. Participants will be provided a bunch of bamboo stick, thread and cutter using which they have to make a structure of three floor. After the making of structure is complete then it will be tested by applying earthquake kind of loading system at different amount of magnitude. The participant whose structure bears the highest amount of loading will be the winner of the event.");

        List<String> rodies = new ArrayList<String>();
        rodies.add("In this event participant will performed different task physical and mentally. ");

        List<String> andhadundh = new ArrayList<String>();
        andhadundh.add("In this game total 2 people participants. 1 participate blind with black patti and other one guide to first one to reach target and path. In this path six or seven obstacles i.e(benches , tires, etc) . First one participant Clear all this object with using their other partners information. Their second partner not give directly clue.He/she give information in funny style. Blindfold people using this information and clear the path and reach the finish line. ");

        List<String> dude = new ArrayList<String>();
        dude.add("Round 1: \nIn this round there will be starting and ending point participant have 2 balls. They will place the ball from starting to ending at the ending point he will throw 2 balls in the basket. After that he will give the balls to his partner at starting point and his partner will repeat the task.");



        expandableListDetail.put("Creaton By Straw(Technical)", straw);
        expandableListDetail.put("Quizomania (Technical)", quizo);
        expandableListDetail.put("Civil Hunt (Technical)", civilHunt);
        expandableListDetail.put("Aqua-seismic (Technical)", aqua);
        expandableListDetail.put("Rodies (Non-Technical)", rodies);
        expandableListDetail.put("Dude Perfect (Non-Technical)", dude);
        expandableListDetail.put("Andhadundh (Non-Technical)", andhadundh);

        return expandableListDetail;
    }
}
