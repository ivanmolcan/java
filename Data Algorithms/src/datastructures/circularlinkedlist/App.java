package datastructures.circularlinkedlist;

public class App {

    public static void main(String[] args) {
        CircularLinkedList circ = new CircularLinkedList();
        circ.insertFirst(55);
        circ.insertFirst(30);
        circ.insertFirst(99);
        circ.insertFirst(1000);
        circ.insertLast(999999);

        circ.displayList();
    }
}
