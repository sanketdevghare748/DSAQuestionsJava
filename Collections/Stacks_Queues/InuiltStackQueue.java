package Sanket.Collections.Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InuiltStackQueue {
    public static void main(String[] args) {
        //Inbuilt stack. (FILO,LIFO)
        Stack <Integer> stack=new Stack<>();

        stack.add(14);
        stack.add(15);
        stack.add(16);
        stack.add(17);
        stack.add(18);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //For stack out error
        if(stack.empty())
        {
            System.out.println(stack.empty());
            //System.out.println(stack.pop());
        }

        //Inbuilt Queues(FIFO,LILO)
        Queue <Integer> queue=new LinkedList<>();

        queue.add(10);
        queue.add(11);
        queue.add(12);

        //
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());




    }
}
