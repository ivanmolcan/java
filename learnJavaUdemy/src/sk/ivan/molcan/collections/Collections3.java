package sk.ivan.molcan.collections;

import java.util.*;
import java.util.Collections;

public class Collections3 {

    public static void main(String[] args) {
        HashSet<Integer> list1 = new HashSet<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer> newList = new ArrayList<Integer>(list1);

        Collections.sort(newList);

        System.out.println(newList);
    }

}
