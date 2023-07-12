package Recursion;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("", maze, 0,0);
    }

    public static void pathRestriction(String p, boolean[][] maze, int row , int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col] ) {
            return;
        }

        if (row < maze.length-1) {
            pathRestriction(p+'V', maze,row+1, col );
        }


        if (col < maze[0].length-1) {
            pathRestriction(p+'H', maze, row, col+1);
        }
    }
}
