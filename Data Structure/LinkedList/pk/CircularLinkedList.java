// package DSA.LinkedList.pk;

public class CircularLinkedList
{
    private Node head ;
    private Node tail;
    private class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    CircularLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value)
    {
        Node node = new Node(value);
        if(head == null)
        {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }

        Node node = head;
        do
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        while(node != head);
        System.out.println();
    }

    public void insertFirst(int value)
    {
        Node node = new Node(value);
        if(head == null)
        {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;
    }

    public void insertAt(int index,int value)
    {
        Node node = new Node(value);
        if(head == null && index == 0)
        {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        if(index == 0)
        {
            insertFirst(value);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
            if(temp == head)
            {
                System.out.println("Invalid Index");
                return;
            }
        }

        if(temp == tail)
        {
            insert(value);
            return;
        }

        node.next = temp.next;
        temp.next = node;
    }
}