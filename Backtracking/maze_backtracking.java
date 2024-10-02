package Backtracking;
//The start index are (s_row,s_Col) for ex. (1,1,)
//The end index are (e_row,e_Col) for ex. (3,3,)
public class maze_backtracking {
    public static void main(String[] args) {
        int start1=0;
        int start2=3;
        int end1=3;
        int end2=3;
        System.out.println(count(start1,start2,end1,end2));
    }

    private static int  count(int s_row, int s_col,int e_row,int e_col) {
        if(s_row==e_row || s_col==e_col)
        {
            return 1;
        }
        int right=count(s_row-1,s_col,e_row,e_col);
        int left=count(s_row,s_col-1,e_row,e_col);
        return right+left;
    }
}
