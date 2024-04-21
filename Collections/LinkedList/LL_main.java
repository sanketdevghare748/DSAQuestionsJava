package Sanket.Collections.LinkedList;

public class LL_main{

    public static void main(String[] args){
//        LL list =new  LL();
//        for(int i=1;i<11;i++) //Added a nodes in the LL
//        {
//            list.insertFirst(i);
//        }

//        try {
            //Display the list
//            list.display();
            //list.insertLast(11);
            //list.display();
            //list.inserValIndex(12, 0);
           // list.display();
            //System.out.println(list.getValueByindex(9));
           // list.display();
            //System.out.println(list.getIndexByValue(12));
           // list.deleteFirst();
            //list.display();
//            list.deleteLast();
//            list.display();
//            list.insertRec(55,4);
////            list.deleteByIndex(6) ;
//            list.display() ;
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

        //For leetcode question: merge two sorted list
        MergeSortedList first= new MergeSortedList();
        MergeSortedList second=new MergeSortedList();
        MergeSortedList ans= new MergeSortedList();

        //insert values in first list
        first.insertLast(1);

        first.insertLast(2);

        first.insertLast(3);

        first.insertLast(5);
        first.display();

        //insert values in second list

        second.insertLast(1);
        second.insertLast(2);

        second.insertLast(2);
        second.insertLast(6);
        second.insertLast(9);
        second.insertLast(14);
        second.display();

        ans=MergeSortedList.mergeSortedList(first,second);
        ans.display();


//        System.out.println("Next program is for Sort list using Bubble sort algo**************");
//        //sort list using bubblesort in LL
//        LL list2= new LL();
//        for(int i=1;i<11;i++) //Added a nodes in the LL
//        {
//            list2.insertFirst(i);
//        }
//        list2.display() ;
//        //list2.bubblesort() ;
//        list2.display();

        //Revers a  linked list code:
        System.out.println("Next program is for reverse a linked list using Recursion algo**************");
        LL list2= new LL();
        for(int i=1;i<11;i++) //Added a nodes in the LL
        {
            list2.insertFirst(i);
        }
        list2.display() ;
        list2.inPlaceReversalLL();
        list2.display();

    }
}
