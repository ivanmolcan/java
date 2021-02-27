package sk.ivanmolcan.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenericMethod {

    private static <T> ArrayList<T> preklopMaNaList(HashMap<Long, T> collection){
        ArrayList<T> list = new ArrayList<>();

        for(Long key : collection.keySet()){
            list.add(collection.get(key));
        }

        return  list;
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        LinkedHashMap<Long, String> stringLinkedHashMap = new LinkedHashMap<>();

        stringList = preklopMaNaList(stringLinkedHashMap);
    }
}
