package sk.ivanmolcan.collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("List 1");
        list.add("List 2");
        list.add("List 3");
        list.add("List 4");

        Collections.shuffle(list);

        for(String s : list){
            System.out.println(s + ", ");
        }
        System.out.println();
        Collections.sort(list);
        for(String s : list){
            System.out.print(s + ", ");
        }
    }
}
