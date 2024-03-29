package Sanket.Collections.LinkedList;

public class InternalLinkedList{
    public static void main(String[] args)  throws  Exception{
        LL list =new  LL();
        for(int i=1;i<11;i++) //Added a nodes in the LL
        {
            list.insertFirst(i);
        }

        try {
            //Display the list
            list.display();
            list.insertLast(11);
            list.display();
            list.inserValIndex(12, 0);
            list.display();
            //System.out.println(list.getValueByindex(9));
           // list.display();
            //System.out.println(list.getIndexByValue(12));
            list.deleteFirst();
            list.display();
            list.deleteLast();
            list.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
