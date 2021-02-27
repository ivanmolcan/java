package sk.ivan.molcan.generics;

import java.util.*;

public class Container<i1, i2> {

    i1 item1;
    i2 item2;

    public Container(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public i1 getItem1() {
        return item1;
    }

    public void setItem1(i1 item1) {
        this.item1 = item1;
    }

    public i2 getItem2() {
        return item2;
    }

    public void setItem2(i2 item2) {
        this.item2 = item2;
    }

    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(12, "Hello");
        Container<Double, Integer> container2 = new Container<>(12.50, 300);

        int val1 = container.getItem1();
        String val2 = container.getItem2();

        Set<String> mySet1 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");

        Set<String> mySet2 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("Computer");

        Set<String> resultSet = union(mySet1, mySet2);

        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

}
