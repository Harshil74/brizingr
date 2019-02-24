package com.example.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Expantable_computer {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> quizzards = new ArrayList<String>();
        quizzards.add("Event Description:\n" +
                "This is C language base quiz. Students will be evaluated on the base of basic, advanced and practical knowledge of C Language.\n" +
                "\nRules:\n" +
                "Use of internet is prohibited.\n" +
                "No any electronic devices are permitted once the event starts.\n" +
                "Any sort of nuisance will not be tolerated and will result into disqualification.\n\n" +
                "Round: 1\n" +
                "In first round of quiz will have 20 questions related to C language and each question carries 1 mark. The answers to the quiz must be given within the given time limit. 30(Top 30) best candidates will be selected for the next round.\n\n" +
                "Round: 2\n" +
                "There will be 10 teams that will be selected by us, each team will have 3 members. 4 to 5 definitions will be given to a participant and it will be team program building test. We will select few extra-ordinary skilled participants for further final round.\n\n" +
                "Round: 3\n" +
                "This will be individual program building test. We will give 2 to 3 hard definitions which will be required to solve within given time limit.");

        List<String> cluder = new ArrayList<String>();
        cluder.add("Event Description: \n" +
                "Clude R Quest event is like technical treasure hunt but riddle/clue is in the form of basic C/C++ program.Team use their brainpower, coding or debugging skills to solve clues.Solution of clue will lead to next clue and then next so on. Team has to find all the clues in minimum time to move in next round.\n" +
                "\n" +
                "Rules:\n" +
                "Mobile with installed QR scanner. No other electronic device are permitted.\n" +
                "This is a team participation event.(max 4 person is allowed in single team)\n" +
                "Solo participation is allowed.(they will be formed in team by event coordinator)\n" +
                "Use of internet is prohibited.\n" +
                "\n" +
                "Round 1:\n" +
                "Game starts by providing QR code to each team which redirect to a C program and team have to solve it, solution leads them to next clue which is in the form of a QR code and follow the same steps until reach to the final clue.\n" +
                "\n" +
                "Round 2:\n" +
                "Selected or the sorted teams will have to perform this the following step for 3 times until they reach final step. They will have to scan the QR code at the starting point then they will be given the clue that redirects to a particular department where they will have take a selfie and come back to the starting point. \n" +
                "The team that takes the least time will be announced winner.\n");


        List<String> zinger = new ArrayList<String>();
        zinger.add("Event Description:\n" +
                "This is graphic based event which includes the use of photoshop and illustrator. Participants will be provided task in three different rounds.\n" +
                "\nRules:\n" +
                "Use of internet is prohibited.\n" +
                "No any electronic devices are permitted once the event starts.\n" +
                "Any sort of nuisance will not be tolerated and will result into disqualification.\n" +
                "The co-ordinators reserve the right to make any change to event whenever deemed.\n" +
                "\nRound: 1\n" +
                "Here the individual participant will be allowed to toss a dice and the number on the dice would decide the type of logo he has to design, For ex if the no is 4 .. manual having the description of the number will be provided and accordingly logo design task will be performed.\n" +
                "\nRound: 2\n" +
                " They will be asked to design the creative set of icons. Again as in round 1, in round 2 also dice will be tossed.\n" +
                "\nRound: 3\n" +
                "This is individual program building test. We will give 5 definitions of practical. It will be hard programs.");

        List<String> frontfest = new ArrayList<String>();
        frontfest.add("Event Description:\n" +
                "FrontFest will satisfy the hunger of a web designer. We have three levels of difficulties where participants will face several challenges related to web designing.\n" +
                "\nRules:\n" +
                "Use of internet is prohibited.\n" +
                "No any electronic devices are permitted once the event starts.\n" +
                "Any sort of nuisance will not be tolerated and will result into disqualification.\n" +
                "The co-ordinators reserve the right to make any change to event whenever deemed.\n" +
                "Not use of any frameworks like bootstrap.\n" +
                "\nRound: 1\n" +
                "In first round we will arrange 30 MCQs Test based on HTML, CSS and JavaScript.\n" +
                "\nRound: 2\n" +
                "Solve front-end challenges using web technologies.\n" +
                "\nRound: 3\n" +
                "In third round participant will be given three web pages to create using any language.\n" +
                "In this round only winner and runner-up will be selected based on his performance and theme design.");

        List<String> logic = new ArrayList<String>();
        logic.add("Event Description:\n" +
                "Logic ++ is A Technical Event Based on Basic Knowledge of Microsoft Office Tools and General Applications of Basic Algorithms. Individual participate and Three Different Levels of Difficulties .After Completion of 3 levels, Winner will declare.\n" +
                "\nRules:\n" +
                "This is an individual participate event.\n" +
                "The co-ordinators reserve the rights to make any changes to event whenever deemed. \n" +
                "\nNecessary:\n" +
                "Use of Internet is prohibited.\n" +
                "No other Electrical devices are permitted once the event had started.\n" +
                "Any sort of nuisance will not be tolerated and will result into disqualification.\n" +
                "\nEvent Flow:\n" +
                "Round 1:\n" +
                "Is the First Pen Paper Based Test Round .There are 35 MCQ and Time duration of 40 Minutes.Questions are Based on General Knowledge of Microsoft Office Tools and Their Applications . Selection is Based on Scores\n" +
                "\nRound 2:\n" +
                "Second Round is divided in Different Applications of Algorithms.Participants Perform the Application on Live . Participants   will be selected for the Next and Final Round based on Time, Correctness  and Minimum Pass They take to  Complete the task .\n" +
                "\nRound 3:\n" +
                "This is the Final and Judgemental round. There is a Bowl with different definitions; you choose one of The Definition and Complete The Given Task  .Criteria for Winners are based on Total Time of Output, Length of Code and Basic Logic of code To Complete The Task .");



        expandableListDetail.put("C Quizzards", quizzards);
        expandableListDetail.put("Clude R Quest", cluder);
        expandableListDetail.put("Creative Zinger", zinger);
        expandableListDetail.put("Front Fest", frontfest);
        expandableListDetail.put("Logic++", logic);

        return expandableListDetail;
    }
}
