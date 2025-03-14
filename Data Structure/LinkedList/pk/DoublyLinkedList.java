// package DSA.LinkedList.pk;

public class DoublyLinkedList
{
    Node head ;
    Node tail ;
    private class Node
    {
        int data ;
        Node prev ;
        Node next ;

        Node(int value)
        {
            this.data = value;
        }

        public Node(int data, Node prev, Node next)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        Node node = head;
        while (node!= null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void displayRevese()
    {
        Node node = head;
        Node last = null;
        while (node!= null)
        {
            last = node;
            node = node.next;
        }

        while(last!=null)
        {
            System.out.print(last.data+" ");
            last = last.prev;
        }
        System.out.println();
    }

    public void insert(int value)
    {
        if(isEmpty())
        {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node last = head;
        while (last.next!= null)
        {
            last = last.next;
        }
        newNode.next = null;
        last.next = newNode;
        newNode.prev = last;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void insertAt(int index,int value)
    {
        if(isEmpty())
        {
            insertFirst(value);
            return;
        }
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        Node node = null;
        Node currentNode = head ;
        Node newNode = new Node(value);

        for(int i=1;i<=index;i++)
        {
            node = currentNode;
            currentNode = currentNode.next;
        }

        if(node == null || currentNode == null)
        {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = node.next;
        newNode.prev = node;
        currentNode.prev = newNode;
        node.next = newNode;
    }
}