// package DSA.LinkedList;
import java.util.LinkedList;

import java.util.Iterator;

public class Main
{
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtBeginning(2);
        list.insertAtBeginning(5);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);
        list.display();

//        Iterator itr = list.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
    }
}