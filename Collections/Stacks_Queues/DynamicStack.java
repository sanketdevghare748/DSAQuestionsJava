package Sanket.Collections.Stacks_Queues;

public class DynamicStack extends CustomStack{
    //Constructor default
    public  DynamicStack()
    {
        super();
    }
    public  DynamicStack(int size)
    {
        super(size);
    }
    //As all the functions of the Customstack are ok and the probleme comes only if stack is full.


    @Override
    public boolean push(int item) {
        if(this.isfull())
        {
            //create an empty array with double the size of already existing one.
            int [] temp=new int[data.length*2];
            //Copy the previous elements of the array to the newly created aray.
            for (int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp ;
        }
        //As my stack is not full here so, we can directly use push from customstack
        return super.push(item);

    }

    public static void main(String[] args) throws Exception {
        DynamicStack stack=new DynamicStack();
        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for(int i=6;i<20;i++)
        {
            stack.push(i);
        }

        stack.display() ;
        //stack.peek() ;

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());



    }
}
