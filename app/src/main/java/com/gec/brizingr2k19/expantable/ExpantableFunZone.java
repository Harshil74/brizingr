package com.gec.brizingr2k19.expantable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpantableFunZone {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> childhood = new ArrayList<String>();
        childhood.add("1. TOP\n" +
                "2.MARBLES\n" +
                "3. NARGOLE\n" +
                "4. GILOL");
        expandableListDetail.put("Back To Childhood (Non-Technical)", childhood);
        return expandableListDetail;
    }
}
