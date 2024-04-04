package Sanket.Collections.LinkedList;

public class CLL_main {
    public static void main(String[] args) {
        CLL list = new CLL();
        for(int i=1;i<10;i++)
        {
            list.insertNew(i);

        }
        list.display();
       // list.delete(5);
        list.display();
        list.insertAfter(6,5);
       list.insertAfter(1,6);
        //list.deleteEven() ;
        list.display() ;


    }
}
