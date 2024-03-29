package Sanket.Collections.LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    //Constructor for public class


    public LL() {
        this.head = null;
        this.tail = null;
        this.size=0;
    }



    //Creating Node classs
    private class Node {
        int value;
        Node next;

        Node prev;
        //Constructor for Node class

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;

        }

        public Node(Node prev) {
            this.prev = prev;
        }
    }

        //Function to insert a first element in the LL
        public void insertFirst( int val)
        {
            Node node=new Node(val);
            node.next=head;
            head=node;

            if (tail==null) //If there is only one element
            {
                tail=head;
            }
            size=+1;

        }
        //Display the Nodes
        public  void display()
        {
            Node temp=head;

            while(temp!=null)
            {
                System.out.print(temp.value + "-> ");
                temp=temp.next;
            }
            System.out.println(" ");

        }

        //Insert at the last

        public void insertLast(int val)
        {
            Node node=new Node(val);
            tail.next=node;
            tail=node;
            tail.next=null;
            //if there is no element means tail==null,head==null
            if(tail==null)
            {
                insertFirst(val);
            }
            size++;
        }

        //insert at a given index
        public void inserValIndex(int val,int index)
        {
            //if my LL has no eleements
            {
                if(index==0)
                {
                    insertFirst(val);
                    return;
                }
                if(index==size)
                {
                    insertLast(val);
                }
                //if my index is  any value other than start or end
                //Move my temp node to index-1.
                Node temp=head;
                for (int i=1;i<index;i++)
                {
                    temp=temp.next ;
                }
                //as we are at index-1 position so we have to create  a new node for new value
                Node node= new Node(temp.next,val);
                temp.next=node ;
                size++ ;
            }
        }
        //Get the value at any index
        public int getValueByindex(int index)
        {
            Node temp=head;
            int i=0;
           while(i!=index)
            {
                temp=temp.next;
                i++;
            }
            //Our temp is now at index node so return the value of the node
            return temp.value ;
        }

        //get the index by value (reverse of above)
        public int getIndexByValue(int val) throws Exception
        {
            Node temp=head;

            int i=0;
            while(temp!=null)
            {
                if(temp.value==val)
                {
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //if given value does not exists in the list
            throw new Exception("The element/value you have entered does not exists in the linked list.") ;

        }
        //Delete first element
            public  void deleteFirst()
            {
                Node temp=head;
                head=temp.next;
                size--;

            }

            //Delete Last element
            public  void deleteLast()
            {
                Node secondLast =getNode(size-2);
                System.out.println("Removed value= "+ secondLast.value);
                tail=secondLast;
                tail.value=secondLast.value;
                tail.next=null;

                size--;
            }

            //Get the node by index value :
            //Here node is returned in the form of Object with some hash code.

            Node getNode(int index)
            {
                Node temp= head;
                for(int i=0;i<index;i++){
                    temp=temp.next;
                }
                System.out.println(temp);
                return temp ;

            }

    }

