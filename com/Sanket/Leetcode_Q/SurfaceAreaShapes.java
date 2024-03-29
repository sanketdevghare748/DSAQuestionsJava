package Sanket.com.Sanket.Leetcode_Q;
//Q: https://leetcode.com/problems/surface-area-of-3d-shapes/

public class SurfaceAreaShapes {
    public static void main(String[] args) {
        int grid [] []={{1,2},
                        {3,4}};
        System.out.println(getSurfaceArea(grid));
    }

    private static int getSurfaceArea(int[][] grid) {
        //Approach create 3 functions for getting sum of any column of 2D array, any row of 2D array, complete sum
        //use case 1:  for sum of all columns of the array
        int total=0;
        int n= grid.length;
        for(int i =0; i<n; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(grid[i][j]>0)
                    total += 6*grid[i][j]-2*(grid[i][j]-1); //Surface Area of 1 cube: 6*grid[i][j]; Common Surface Area of vertically placed cubes:2*(grid[i][j]-1)

                if(i>0)
                    total-= 2*Math.min(grid[i-1][j],grid[i][j]);//Hidden common vertical surface area

                if(j>0)
                    total-= 2*Math.min(grid[i][j-1],grid[i][j]);//Hidden common horizontal surface area
            }
        }
        return total;
    }
}
