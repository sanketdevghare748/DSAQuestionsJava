package Sanket.Collections.Stacks_Queues;
//Internal implementation of Stack
//This is a simple stack, with fixed length.
public class CustomStack {
    protected  int [] data;
    private static final int Default_Size=10;
     int ptr=-1;

    //Constructor
    public CustomStack(int size)
    {
        this.data=new int [size] ;
    }
    //default constructor
    public CustomStack()
    {
        this(Default_Size);
    }
    public  boolean push (int item)

    {
        if(isfull())
        {
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }



    public  int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Can not po item from an Empty stack !!");
        }
        return data[ptr--];
    }
    public  int peek() throws  Exception
    {
        if(isEmpty())
        {
            throw new Exception("The stack is empty!!");
        }
        return data[ptr] ;
    }

    //isfull
    public boolean isfull() {
        return ptr==data.length-1; //if my ptr is already at last of data..
    }
    public boolean isEmpty()
    {
        return  ptr==-1; //means ptr never increased.

    }
    //Show complete stack element at a time
    public void display()
    {
        for(int i=0; i<data.length;i++)
        {
            System.out.print(data[i]+" , ");
        }
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack();
        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display() ;
        //stack.peek() ;

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());



    }


}
