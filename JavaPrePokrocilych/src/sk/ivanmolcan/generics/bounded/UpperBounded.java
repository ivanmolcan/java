package sk.ivanmolcan.generics.bounded;

import java.util.List;

public class UpperBounded {

    public static void main(String[] args) {

    }

    public static <P extends Number> double sumOfList(List<P> list){
        double s = 0.0;
        for(P p : list){
            s+= p.doubleValue();
        }
        P i = list.get(1);
        list.add(i);

        return s;
    }

    //Pouzivam ked z kolekcie vytahujem a nic nevkladam
    public static double sumOfList2(List<? extends Number> list){
        double s= 0.0;
        for(Number n : list){
            s+= n.doubleValue();
        }
        Number i = list.get(1);
//        list.add(i);

        return s;
    }
}
