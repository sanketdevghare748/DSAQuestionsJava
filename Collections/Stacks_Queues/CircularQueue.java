package Sanket.Collections.Stacks_Queues;

public class CircularQueue {
    protected int [] data;
    private static final int Default_Size=10;

    int end =0;
    int size=0;
    int front=0;

    public CircularQueue()
    {
        this(Default_Size);
    }

    public CircularQueue( int size)
    {
        this.data=new int[size];
    }
    public boolean isFull()
    {
        return size==data.length-1;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    //insert functions
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    //remove function
    public int remove() throws RuntimeException
    {
        if(isEmpty())
        {
            throw new RuntimeException("The Queue is empty!!");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    //Display function
    public void display()
    {
        for(int i=front;i<end;i++)
        {
            System.out.print(data[i]+" ->");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue();

        queue.isFull();

        for(int i=0;i<11;i++)
        {
            queue.insert(i);

        }
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }



}
