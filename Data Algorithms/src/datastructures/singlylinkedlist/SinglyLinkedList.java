package datastructures.singlylinkedlist;

public class SinglyLinkedList {
    //Ma len first, ale nie last

    private Node first;
    private Node last;

    public SinglyLinkedList() {
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        last = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

//    public void insertLast(int data){
//        Node current = first;
//        while(current.next != null){
//            current = current.next;
//        }
//        Node newNode = new Node();
//        newNode.data = data;
//        current.next = newNode;
//    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        last.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sing = new SinglyLinkedList();
        sing.insertFirst(55);
        sing.insertFirst(30);
        sing.insertFirst(99);
        sing.insertFirst(1000);
        sing.insertLast(999999);

        sing.displayList();
    }
}
