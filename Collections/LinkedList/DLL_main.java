package Collections.LinkedList;

public class DLL_main {
    public static void main(String[] args) {
        DLL list = new DLL();
        for(int i=1;i<10;i++)
        {
            list.insertFirst(i);

        }
        list.display();
        list.display_Rev();
        list.display();//This is new code

    }
}
