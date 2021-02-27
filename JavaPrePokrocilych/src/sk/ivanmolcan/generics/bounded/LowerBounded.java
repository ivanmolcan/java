package sk.ivanmolcan.generics.bounded;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addInteger(list);
        addInteger(list);
        addInteger(list);
    }

    //super, ze len nadradene triedy vcetne tej za super
    public static void addInteger(List<? super Integer> list){
        int i = (int) (Math.random()*10);
        System.out.println(i);
        list.add(i);
    }
}
