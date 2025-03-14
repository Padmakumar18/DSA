// package DSA.LinkedList.pk;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList()
    {
        this.size = 0;
    }

    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void insertAt(int index,int value)
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        if(index ==0)
        {
            insertFirst(value);
            return;
        }
        if(index == size)
        {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size++;
    }

    public void insertLast(int value)
    {
        if(isEmpty())
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    private  class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
    public boolean isEmpty()
    {
        return tail == null;
    }

    public void deleteFirst()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        head = head.next;

        if(head == null)
        {
            tail = null;
        }
        size--;
    }

    public void deleteLast() throws Exception {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        if(size <= 1)
        {
            deleteFirst();
        }
        Node temp = get(size-2);
        int val = temp.value;
        tail = temp;
        tail.next = null;
    }

    public Node get(int index) throws Exception {
        Node node = head;
        if(isEmpty())
        {
            throw new Exception("Empty List");
        }

        for(int i=0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public int delete(int index) throws Exception
    {
        if(index == 0)
        {
            deleteFirst();
        }
        if(index == size-1)
        {
            deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
}
