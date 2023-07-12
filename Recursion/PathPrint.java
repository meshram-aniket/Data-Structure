package Recursion;

import java.util.Arrays;

public class PathPrint {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] board = new int[maze.length][maze[0].length];
        allPathPrint(maze, "", 0,0,board, 1);
    }

    public static void allPathPrint(boolean[][] maze, String p, int row, int col, int[][] board, int steps) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            board[row][col]= steps;
            for (int[] arr: board) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        board[row][col] = steps;
        if (row < maze.length-1) {
            allPathPrint(maze, p+'D', row+1, col, board, steps+1);
        }

        if (col < maze[0].length-1) {
            allPathPrint(maze, p+'R', row, col+1, board, steps+1);
        }

        if (row > 0) {
            allPathPrint(maze, p+'U', row-1, col, board, steps+1);
        }

        if (col > 0 ) {
            allPathPrint(maze, p+'L', row, col-1, board, steps+1);
        }

        maze[row][col] = true;
        board[row][col] = 0;
    }
}