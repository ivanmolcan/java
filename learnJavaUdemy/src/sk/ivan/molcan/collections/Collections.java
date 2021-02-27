package sk.ivan.molcan.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {


        ArrayList words = new ArrayList();
        words.add("hello");
        words.add("there");
//        words.remove(0);
        words.add(10);

        String item1 = (String)words.get(1);

//        System.out.println(item1);

//        for(Object i : words){
//            System.out.println(i);
//        }

        ArrayList<String> text = new ArrayList<String>();
        text.add("First");
        text.add("Second");
        text.add("12");

        for(String i : text){
            System.out.println(i);
        }

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);

    }

}
