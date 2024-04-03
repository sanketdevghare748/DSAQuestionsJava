package Sanket.Collections.LinkedList;

public class DLL {
    Node head;
    Node tail;


    private class Node {
        int value;
        Node next;
        Node prev;

        //Constructors for Node class.
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

        //UC1: Insertfirst elements
        public void  insertFirst(int value)
        {
            Node node=new Node(value);
            node.next=head;
            node.prev=null;
            //make my node the head
            head=node ;
        }

        //UC2: Display all the elements of the list
            public  void display()
            {
                Node temp=head;
                while(temp!=null)
                {
                    System.out.print(temp.value+"->");
                    temp=temp.next;
                }
                System.out.println(" ");//to add the new line after one list is displayed
            }

            //UC3:Display the elenent of the list in revers
            public  void display_Rev()
            {
                Node temp=tail;
                while(temp!=null)
                {
                    System.out.print(temp.value+ "<-");
                    temp=temp.prev;
                }
                System.out.println(" ");

            }

    }

