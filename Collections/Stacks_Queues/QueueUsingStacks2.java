package Sanket.Collections.Stacks_Queues;

import java.util.EmptyStackException;
import java.util.Stack;

//Implement basic functions of Queue ex. peek,empty,push,pop using stacks.
//This will pop efficient approach.
public class QueueUsingStacks2 {
    private Stack <Integer> first;
    private Stack <Integer> second;

    public QueueUsingStacks2()
    {
        first =new Stack<>();
        second =new Stack<>();

    }
    //This is an insert effficient method.
    public void add(int item)
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        second.push(item);
        //Put data from stack 2 back to stack1.
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
    }


    //pop function.
    public  int pop() throws EmptyStackException

    {
        if(first.empty())
        {
            throw new EmptyStackException() ;
        }

        return first.pop();
    }

    //Peek function
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
        QueueUsingStacks2 queue=new QueueUsingStacks2();
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
