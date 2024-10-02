package Backtracking;

public class Maze_with_HVD {
    public static void main(String[] args) {
        System.out.println(showPathHVD("",3,3));
    }

    private static int showPathHVD(String p, int r ,int c) {
        if(r==1 &&c==1)
        {
            System.out.print(p+" ");
            return 1;
        }
        int right=0;
        int left=0;
        int ans=0;
        int diag=0;


        if(r>1)
        {
            //Calling right path.
            right=showPathHVD(p+'V',r-1,c);

        }
        if(c>1)
        {
            left=showPathHVD(p+'H',r,c-1);
        }

        if(r>1 && c>1)
        {
            diag=showPathHVD(p+"D",r-1,c-1);
        }
        return right+left+diag;
    }
}
