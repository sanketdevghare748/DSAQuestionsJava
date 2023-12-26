package Sanket.Strings;

public class Pattern_Questions {
    public static void main(String[] args) {
        int n=4;
        pattern3(n);

    }
    static void pattern1(int n)
    {
        for(int row=1;row<=4;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for(int row=1;row<=4;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(row + " ");
            }
            for(int spaces=1;spaces<=n-row;spaces++)
            {
                System.out.print(" ");
            }
            System.out.println();
            //For loop for  outer spaces.


        }
    }
    //Patern 3 : number  changing Pyramid.
    //1
    //2 3
    // 4 5 6
    static  void pattern3(int n){
        for(int row =0;row<n;row++)
        {
           // col=?
            for(int col=row;col<row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }


}
