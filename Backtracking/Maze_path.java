package Backtracking;

//return the path for maze question in the form of RD.
public class Maze_path {
    public static void main(String[] args) {
        System.out.println(showPath("", 3, 3));
    }

    private static int showPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return 1;
        }
        int right = 0;
        int left = 0;
        int ans = 0;


        if (r > 1) {
            //Calling right path.
            right = showPath(p + 'D', r - 1, c);

        }
        if (c > 1) {
            left = showPath(p + 'R', r, c - 1);
        }
        return right + left;
    }
}
