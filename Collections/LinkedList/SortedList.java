package Sanket.Collections.LinkedList;

import Sanket.Oops_Concept.Parent;

public class SortedList {
    SortedList.Node head;
    private SortedList.Node tail;

    private int size;
    //Constructor for public class


    public SortedList() {
        this.head = null;
        this.tail = null;
        this.size=0;
    }



    //Creating Node classs
    private static class Node {
        int value;
        SortedList.Node next;

        SortedList.Node prev;
        //Constructor for Node class

        public Node(int value) {
            this.value = value;
        }

        public Node(SortedList.Node next, int value) {
            this.next = next;
            this.value = value;

        }

        public Node(SortedList.Node prev) {
            this.prev = prev;
        }
    }
    //Function to insert a first element in the LL
    public void insertFirst( int val)
    {
        if (tail==null) //If there is only one element
        {
            tail=head;
        }

        SortedList.Node node=new SortedList.Node(val);
        node.next=head;
        head=node;


        //size=+1;

    }
    //Display the Nodes
    public  void display()
    {
        SortedList.Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.value + "-> ");
            temp=temp.next;
        }
        System.out.println(" ");

    }

    //code to get the middle node of the the linked list/
    public static Node getmid(Node head)
    {
        Node f=head;
        Node s=head;
        if(f== null || f.next==null)
        {
            return head;
        }
        do{
            f=f.next.next;
            s=s.next;
        }while (f.next!=null) ;
        return s ;
    }

    //code to sort the list
    public static Node SortList(Node head)
    {
        if(head==null || head.next==null)
        {
            return  head ;
        }
        Node right=SortList(getmid(head));
        Node left=SortList(head);
        return MergeSortedList(right,left);

    }

    //Code to merge to sorted list
    public static Node MergeSortedList(Node left, Node right)
    {
        Node dummy = new Node(-1);
        Node current = dummy;
        while (left != null && right != null) {
            if (left.value <= right.value) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left!=null){
            current.next=left;
        }
        if(right!=null){
            current.next=right;
        }

        return dummy.next;
    }
    public void insertLast(int val)
    {
        //if there is no element means tail==null,head==null
        if(head==null)
        {
            insertFirst(val);
        }

        SortedList.Node node=new SortedList.Node(val);
        tail.next=node;
        tail=node;
        tail.next=null;

        //size++;
    }
    //Code to check if the linked list is the palindrome or not.
    public boolean isListPalindrome()
    {

        Node rabbit = head;
        Node tortoise = head;
        while(rabbit != null && rabbit.next != null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }

        //reverse 2nd part of the list
        Node SecondHead = reverse(tortoise) ;
        Node reversedHead=SecondHead;

        //Compare both the halves
        while(head!=null && SecondHead!=null)
        {
            if(head.value!=SecondHead.value)
            {
                break;
            }
            head=head.next;
            SecondHead=SecondHead.next;
        }
        reverse(reversedHead);
        return head==null || SecondHead==null;
    }

    Node  reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public static void main(String[] args) {
        System.out.println("Next program is for reverse a linked list using Recursion algo**************");
        SortedList list2= new SortedList();
        for(int i=2;i<9;i++) //Added a nodes in the LL
        {
            if(i<=5)
                list2.insertFirst(i);
            else
                list2.insertFirst(10-i);

        }
        list2.display() ;
        System.out.println(list2.isListPalindrome());
        list2.display();
    }
}

