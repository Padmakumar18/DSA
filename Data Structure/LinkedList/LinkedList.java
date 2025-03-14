// package DSA.LinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T>
{
    Node head;
    Node tail;
    int size = 0;

    public Iterator<T> iterator()
    {
        return new Iterator<T>()
        {
            Node temp = head;
            @Override
            public boolean hasNext()
            {
                return temp != null;
            }

            @Override
            public T next()
            {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

//    @Override
//    public boolean hasNext()
//    {
//        return false;
//    }
//
//    @Override
//    public T next()
//    {
//        return null;
//    }
//
//    @Override
//    public void remove()
//    {
//        Iterator.super.remove();
//    }
//
//    @Override
//    public void forEachRemaining(Consumer<? super T> action)
//    {
//        Iterator.super.forEachRemaining(action);
//    }

    class Node
    {
        T data;
        Node next;

        public Node(T value)
        {
            data = value;
            next = null; // Initially new node next is null after we point the next data where we want
            size ++;
        }
    }

    LinkedList()
    {
        head = null; // When user create new object for LinkedList the new Linked list should be create So initially head is null
    }

    public void insertAtBeginning(T value)
    {
        Node newNode = new Node(value);
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
         Node temp = head;
         while(temp != null)
        {
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtPos(int pos,T value) {
        if(pos == 0)
        {
            insertAtBeginning(value);
            return ;
        }
        if(size <= pos)
        {
            throw new IllegalArgumentException("Invalid positions");
//            System.out.println("Invalid position");
//            return ;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 1; i < pos; i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAt(int pos) throws Exception
    {
        if(isEmpty())
        {
//            System.out.println("List is empty");
            throw new IndexOutOfBoundsException("List is empty");
        }
        if(pos == 0)
        {
            deleteAtBegin();
            return;
        }
        Node temp = head;
        Node prev = null;

        for(int i=1;i<=pos;i++)
        {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public void deleteAtBegin() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is empty");
        }
        head = head.next;
    }

    public T get(int index) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        if(index == 0)
        {
            return  head.data;
        }
        Node temp = head;
        for(int i=1;i<=index;i++)
        {
            temp = temp.next;
        }
        return  temp.data;
    }

    public void update(int index,T value) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        if(index == 0)
        {
            head.data = value;
            return;
        }
        Node temp = head;
        for(int i=1;i<=index;i++)
        {
            temp = temp.next;
        }
        temp.data = value;
    }

    public void deleteAtEnd() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void insertAtEnd(T value) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        Node newNode = new Node(value);
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int search(T value) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        Node temp = head;
        int i=0;
        while(temp.data != value && temp.next != null)
        {
            i++;
            temp = temp.next;
        }
        if(temp.next == null)
        {
            return -1;
        }
        return i;
    }

    public boolean contains(T value) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        Node temp = head;
        while(temp.data != value && temp.next != null)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            return false;
        }
        return true;
    }
}