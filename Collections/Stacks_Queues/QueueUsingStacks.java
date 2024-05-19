package Sanket.Collections.Stacks_Queues;

import java.util.EmptyStackException;
import java.util.Stack;

//Implement basic functions of Queue ex. peek,empty,push,pop using stacks.
public class QueueUsingStacks {
    private Stack <Integer> first;
    private Stack <Integer> second;

    public QueueUsingStacks()
    {
        first =new Stack<>();
        second =new Stack<>();

    }
    //This is an insert effficient method.
    public void add(int item)
    {
        first.push(item);
    }

    //pop function.
    public  int pop() throws EmptyStackException

    {
        if(first.empty())
        {
            throw new EmptyStackException() ;
        }
        while(!first.isEmpty())
        {
            second.push(first.pop());

        }
        int removed= second.pop();
        //Put data from stack 2 back to stack1.
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return removed;
    }

    //Peek fucntion
    public int peek()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peeked= second.peek();
        //Put data from stack 2 back to stack1.
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;
    }

    //Empty function
    public boolean isEmpty()
    {
        return first.isEmpty();
    }

    //Main function
    public static void main(String[] args)  throws EmptyStackException {
        QueueUsingStacks queue=new QueueUsingStacks();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


        System.out.println(queue.isEmpty());
    }
}
