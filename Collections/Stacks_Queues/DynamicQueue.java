package Sanket.Collections.Stacks_Queues;
//using Circular Queue.
public class DynamicQueue extends CircularQueue{
    public DynamicQueue()
    {
        super();
    }
    public DynamicQueue(int size)
    {
        super(size);
    }
   //Write a function to insert the item inside the queue
    @Override
    public boolean insert(int item)
    {
       if (this.isFull())
        {
            //increate size of  data array by 2x.
            int temp []=new int [data.length*2];

            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[(front+i)% data.length];
            }
            front=0;
            end= data.length;
            data=temp;
        }
       return super.insert(item);
    }
    public static void main(String[] args) {
        DynamicQueue queue=new DynamicQueue();

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
