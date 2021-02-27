package sk.ivanmolcan.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10,"jaro");
        map.put(1,"fero");
        map.put(3,"duro");
        map.put(4000,"karol");

        for(Map.Entry m : map.entrySet()){
//            System.out.print(m.getKey() + ": " + m.getValue());
            System.out.printf("%d: %s %n",m.getKey(),m.getValue());
        }
        System.out.println();
        for(Integer k : map.keySet()){
            System.out.println(map.get(k));
        }

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(4000));

    }
}
