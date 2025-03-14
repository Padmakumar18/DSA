// package DSA.LinkedList.pk;

public class Main {
    public static void main(String[] args) throws Exception {
//        LinkedList list = new LinkedList();
//        list.insertFirst(1);
//        list.insertFirst(23);
//        list.insertFirst(2);
//        list.insertLast(99);
//        list.display();
//        System.out.println();
//        list.insertAt(3,100);
//
//        list.display();
//        list.deleteLast();
//        System.out.println();
//        list.display();
//        list.delete(2);
//        System.out.println();
//        list.display();

//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(6);
//        list.insertFirst(9);
//        list.insertFirst(7);
//        list.display();
//        list.insertAt(3,77);
//        list.display();

        CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(3);
        list.insert(6);
        list.insert(1);
        list.insert(8);
        list.display();
//        list.insertFirst(333);
//        list.insertFirst(888);
        list.insertAt(7,555);
        list.display();
    }
}