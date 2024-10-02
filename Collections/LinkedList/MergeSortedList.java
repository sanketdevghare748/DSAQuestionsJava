package Collections.LinkedList;

public class MergeSortedList {

    Node head;
    private Node tail;

    private int size;

    public MergeSortedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }

    public void insertFirst( int val)
    {
        if (tail==null) //If there is only one element
        {
            tail=head;
        }
        Node node= new  Node(val);
        node.next=head;
        head=node;
        size++;

    }

    public void insertLast(int val)
    {
        Node node = new Node (val);
        //if there is no element means tail==null,head==null
        if(head==null) {
            head = node;
            tail = node;
            tail.next = null;
        }
        else{
            tail.next = node;
            tail = node;
            tail.next = null;
            size++;
        }
    }
    public  void display()
    {
        MergeSortedList.Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.value + "-> ");
            temp=temp.next;
        }
        System.out.println(" ");

    }
    public static MergeSortedList mergeSortedList(MergeSortedList first, MergeSortedList second)
    {
        Node f =first.head;
        Node s =second.head;

        //Created another linked list for ans
        MergeSortedList ans=new MergeSortedList();

        while(f!=null && s!=null) {
            if (f.value <s.value) //compare the value of the node of two list and take the smaller one and move next in that list
            {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;

            }
        }
        //After traversing one list if one list ends then add the second lsit as it is in the  ans list at the end
        while(f!=null)
        {
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null)
        {
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

}
