package Sanket.Backtracking;

import java.util.Arrays;

public class Backtracking_printPath
{
    public static void main(String[] args) {

        //Initialise the bool array representing the maze board ,false as the obstacles.
        boolean[][] maze = new boolean[][]{{true, true, true},
                                           {true, true, true},
                                           {true, true, true}};

        //Initialise the int array representing with empty and print the path in it with the steps number.
        int [][]arr=new int[maze.length] [maze[0].length];


        int count = showAllPaths("", maze, 0, 0, arr, 1);
        System.out.println("The number of possible ways= "+ count);

    }

    private static int showAllPaths(String p, boolean[][] maze, int r, int c,int[][] arr, int step) {
        //Note: Here the position of the block matter as the recursive calls follow the BLC.

        int right = 0;
        int left = 0;
        int up = 0;
        int down = 0;
        int diag = 0;
        if (!maze[r][c]) {

            return 0;
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p + " ");
            //step += 1;
            for(int[] path: arr)
            {
                System.out.println(Arrays.toString(path));
            }
            return 1;
        }
        maze[r][c] = false;
        arr[r][c]=step;
//We are flagging the visited cells as false.

        if (r < maze.length - 1) {
            //Calling right path.
            down = showAllPaths(p + 'D', maze, r + 1, c,arr,step+1);

        }


        if (c < maze[0].length - 1) {
            right = showAllPaths(p + 'R', maze, r, c + 1,arr,step+1);
        }


        if (r < maze.length - 1 && c < maze[0].length - 1) {
            diag = showAllPaths(p + "C", maze, r + 1, c + 1,arr,step+1);
        }
        if (r > 0) {
            up = showAllPaths(p + 'U', maze, r - 1, c,arr,step+1);
        }
        if (c > 0) {
            left = showAllPaths(p + 'L', maze, r, c - 1,arr,step+1);
        }
        //As in the start we have marked all those field as False where we have visited and now its time to undo the chnages.
        //So again mark the cell as true so that in new function call we can start with fresh matrix and mark the visted cells a
        maze[r][c] = !(maze[r][c]);
        arr[r][c]=0;
        return down + right + left + diag + up;
}}
