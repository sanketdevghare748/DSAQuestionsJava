package Collections.LinkedList;

public class LL {
    Node head;
    private Node tail;

    private int size;
    //Constructor for public class


    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
    public void insertFirst(int val) {
        if (tail == null) //If there is only one element
        {
            tail = head;
        }

        Node node = new Node(val);
        node.next = head;
        head = node;


        //size=+1;

    }

    //Display the Nodes
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println(" ");

    }

    //Insert at the last

    public void insertLast(int val) {
        //if there is no element means tail==null,head==null
        if (head == null) {
            insertFirst(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        tail.next = null;

        //size++;
    }

    //insert at a given index
    public void inserValIndex(int val, int index) {
        //if my LL has no eleements
        {
            if (index == 0) {
                insertFirst(val);
                return;
            }
            if (index == size) {
                insertLast(val);
            }
            //if my index is  any value other than start or end
            //Move my temp node to index-1.
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            //as we are at index-1 position so we have to create  a new node for new value
            Node node = new Node(temp.next, val);
            temp.next = node;
            size++;
        }
    }

    //Get the value at any index
    public int getValueByindex(int index) {
        Node temp = head;
        int i = 0;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        //Our temp is now at index node so return the value of the node
        return temp.value;
    }

    //get the index by value (reverse of above)
    public int getIndexByValue(int val) throws Exception {
        Node temp = head;

        int i = 0;
        while (temp != null) {
            if (temp.value == val) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //if given value does not exists in the list
        throw new Exception("The element/value you have entered does not exists in the linked list.");

    }

    //Delete first element
    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        size--;

    }

    //Delete Last element
    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;

        }
        Node secondValue = getNode(size - 2);
        tail = secondValue;
        tail.next = null;

        size--;
        System.out.println("Removed first element ie." + secondValue.value);
    }

    //Get the node by index value :
    //Here node is returned in the form of Object with some hash code.

    Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp);
        return temp;

    }

    //Delete value at first index
    public void deleteByIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = getNode(size - 2);
        prev.next = prev.next.next;
        return;
    }

    //Insert in Singly linked list using the recursions
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(node, val);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    //Sort the list using buuble sort in LL.
    public void bubblesort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = getNode(col);
            Node second = getNode(col + 1);

            if (first.value > second.value) {
                //swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }

            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    //Code for Revers a linked list using recursion
    public void reverseRec(Node node) {
        if (head == tail) {
            return;
        }
        if (node != null) {
            reverseRec(node.next);
        }
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    //Reverse a linked list using a in place reversal approach
    public void inPlaceReversalLL() {
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
            head = prev;
        }

    }
}


