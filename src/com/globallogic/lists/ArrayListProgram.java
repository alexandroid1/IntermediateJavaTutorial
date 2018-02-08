package com.globallogic.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        // add array items to list
        for ( String x: things ) {
            list1.add(x);
        }

        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        // add array items to list
        for ( String y: morethings ) {
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1, list2);
        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    private static void editlist(List<String> l1, List<String> l2) {
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            if (l2.contains(it.next()))
                it.remove();
        }
    }
}
