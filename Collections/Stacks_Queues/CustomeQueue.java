package Sanket.Collections.Stacks_Queues;

import java.util.Queue;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class CustomeQueue {
    private int [] data;
    private static  final  int Default_Size=10;
    int end=-1;

    //Constructors
    public CustomeQueue()
    {
        this(Default_Size) ;
    }

    public CustomeQueue(int size)
    {
        this.data=new int[size];

    }
    public boolean isfull()
    {
        return  end ==data.length-1;
    }

    public  boolean isEmpty()
    {
        return  end==-1;
    }

    public  boolean insert(int item)
    {
        if(isfull())
        {
            return  false;
        }
        data[++end]=item;
        return true;
    }

    public int remove () throws  Exception{
        if(isEmpty())
        {
            throw  new Exception("The Queue is already empty so can not remove any items.");
        }
        int removed=data[0];
        //shift the elements to left
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];
        }
        end--;
        return  removed;
    }
    //Peek=front
    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("The Queue is already empty!!");
        }
        return data[0];
    }

    //Display function
    public  void display()
    {
        for(int n:data)
        {
            System.out.println(n);
        }
    }

    //Main function for Queue
    public static void main(String[] args) throws Exception {
        CustomeQueue queue=new CustomeQueue();

        queue.isfull();

        for(int i=0;i<=10;i++)
        {
            queue.insert(i);

        }
        //queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
