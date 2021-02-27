package sk.ivanmolcan.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("element1");
        set1.add("element2");
        set1.add("element3");

//        System.out.println(set1.contains("element1"));

        Iterator i = set1.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + ", ");
        }

//        Set<String> set2 = new HashSet<>();
//        set2.add("element4");
//        set2.add("element5");
//        set2.add("element6");
//
//        printSet(set1);

    }

    private static void printSet(Set<String> set){
        for(String s : set){
            System.out.println(s);
        }
    }

}
