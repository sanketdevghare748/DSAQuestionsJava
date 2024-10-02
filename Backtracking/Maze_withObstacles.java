package Backtracking;

/* Here we need to avoid the blockers and guess the path, and we are starting from zero hence we need to increase the row and column values*/
public class Maze_withObstacles {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[][]
                {{true, true, true},
                {true, false, false},
                {true, true, true}};
        //Initialise the bool array representing the maze board ,false as the obstacles.

        int count = showPathObst("", maze, 0, 0);
        System.out.println(count);
    }

    private static int showPathObst(String p, boolean[][] maze, int r, int c) {
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
            System.out.print(p + " ");
            return 1;
        }
        maze[r][c] = false;
//We are flagging the visited cells as false.

        if (r < maze.length - 1) {
            //Calling right path.
            down = showPathObst(p + 'D', maze, r + 1, c);

        }


        if (c < maze[0].length - 1) {
            right = showPathObst(p + 'R', maze, r, c + 1);
        }


        if (r < maze.length - 1 && c < maze[0].length - 1) {
            diag = showPathObst(p + "C", maze, r + 1, c + 1);
        }
        if (r > 0) {
            up = showPathObst(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            left = showPathObst(p + 'L', maze, r, c - 1);
        }
        //As in the start we have marked all those field as False where we have visited and now its time to undo the chnages.
        //So again mark the cell as true so that in new function call we can start with fresh matrix and mark the visted cells a
        maze[r][c] = !(maze[r][c]);
        return down + right + left + diag + up;

    }
}


