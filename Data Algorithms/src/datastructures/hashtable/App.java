package datastructures.hashtable;

public class App {

    public static void main(String[] args) {

        HashTable table = new HashTable(20);
        table.insert("Apple");
        table.insert("Hello");
        table.insert("Feeling");
        table.insert("Water");
        table.insert("Africa");
        table.insert("Speed");
        table.insert("Phone");
        table.insert("September");
        table.insert("Michael");
        table.insert("Huge");

        System.out.println("---------- Find Elements --------------");
//        System.out.println(table.find("Apple"));
//        System.out.println(table.find("Zebra"));
//        System.out.println(table.find("Feeling"));
//        System.out.println(table.find("Africa"));

        table.displayTable();

    }
}