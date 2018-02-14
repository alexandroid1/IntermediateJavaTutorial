package com.globallogic.collectionmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyAndDisjointMethods {
    public static void main(String[] args) {
        //convert staff array to a list
        String[] stuff = {"apples", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");

        for(String x : list2)
            System.out.printf("%s ", x);

        Collections.addAll(list2, stuff); // Add All Method

        System.out.println();
        for(String x : list2)
            System.out.printf("%s ", x);

        System.out.println();
        System.out.println(Collections.frequency(list2, "digg")); // frequency Method

        // true if the two specified collections have no elements in common
        boolean tof = Collections.disjoint(list1, list2); // disjoint
        System.out.println(tof);

        if (tof)
            System.out.println("these list do not have anything in common");
        else
            System.out.println("these list must have something in common");
    }
}
