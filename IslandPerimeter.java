//You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
//Grid cells are connected horizontally/vertically (not diagonally). 
//The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). 
//The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
//One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
//Determine the perimeter of the island.

public class Solution {
    public int islandPerimeter(int[][] grid) {
        //define two variables to count the islands number and neighbors in their right and down
        int islands = 0;
        int neighbors = 0;
        
        int perimeter = 0;
        
        //iterate the two-dimension array and count numbers
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    islands++;
                    //check the right side of this island
                    if(j < (grid[i].length-1) && grid[i][j+1] == 1) neighbors++;
                    //chech the down side of this island
                    if(i < (grid.length-1) && grid[i+1][j] == 1) neighbors++;
                } 
                
            }
        }
        
        perimeter = islands * 4 - neighbors * 2;
        return perimeter;
    }
}
