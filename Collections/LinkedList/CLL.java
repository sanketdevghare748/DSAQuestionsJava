package Sanket.Collections.LinkedList;

import javax.sound.midi.Soundbank;

public class CLL {
    public Node head;
    public Node tail;

    //Constructor for CLL class

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    private class Node {
        private int val;
        private Node next;

        //Constructor for Node class value of node
        public Node(int val) {
            this.val = val;
        }

        //Constructor for Node next.
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

        //Insert new value at the end ie. after tail
        public void insertNew(int val)
        {
            Node node =new Node(val);
            //Check if the head is null.
            if(head==null)
            {
                head=node;
                tail=node;
                return;
            }
            tail.next=node;
            node.next=head;
            tail=node ;

        }

        //Display the CLL
        public void display() {
            Node node = head;
            if (head != null) {
                do {
                    System.out.print(node.val + "->");
                    node = node.next;
                } while (node != head);
            }
           System.out.println("END");
        }
        //Delete a value from the linked lis
        public void delete(int value) {
            Node node = head;
            if (node == null) {
                //There are no elements
                return;
            }
            if (node.val == value) {
                //Means we have to remove first element only.
                head = head.next;
                tail.next = head;
                return;
            }
            //All other cases
            do {
                Node n = node.next;
                if (n.val == value) {
                    node.next = n.next;
                    break;
                }
                node = node.next;
            } while (node != head);
            //System.out.println("Element does not exists in the CLL.");
        }

            //Insert the element after a value as here we do not have specific index because its all connected
            public void insertAfter(int value, int after)
            {
                Node node=new Node(value);
                Node temp=head;
                //To handle null pointer exception if there is no element at first
                if(temp==null)
                {
                    insertNew(value);
                    head.next=head;
                    tail.next=head;
                    return;
                }
                if(temp.val==after)
                {
                    temp.next=node;
                    node.next=temp.next;
                    return;
                }
                do {
                    if (temp.val == after) {

                        node.next = temp.next;
                        temp.next=node;
                        break;
                    }
                    temp = temp.next;
                }while(temp!=tail) ;
            }
            //Remove the element if its even
            public void deleteEven()
            {
                Node temp=head;
                do{
                    if(temp.val%2==0)
                    {
                        delete(temp.val);
                    }
                    temp=temp.next;
                }while(temp!=head);
            }
        }

