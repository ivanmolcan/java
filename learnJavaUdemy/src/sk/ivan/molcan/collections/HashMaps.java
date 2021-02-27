package sk.ivan.molcan.collections;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain.");
        dictionary.put("Joy", "feeling of great pleasure.");
        dictionary.put("Confidence", "state of good feeling.");

        for(String word : dictionary.keySet()){
            System.out.println(dictionary.get(word));
        }

//        for(Map.Entry<String, String> entry : dictionary.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        System.out.println("----------------");

        TreeMap<String, String> treeDictionary = new TreeMap<String, String>();
        treeDictionary.put("Brave", "ready to face and endure danger or pain.");
        treeDictionary.put("Joy", "feeling of great pleasure.");
        treeDictionary.put("Confidence", "state of good feeling.");

        for(Map.Entry<String, String> entry : treeDictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
