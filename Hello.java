public class Hello {
    public  static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        NQueen(board, 0, 0, 0);
    }

    public static void NQueen(boolean[][] board, int knight, int row, int col) {
       if (knight == board.length) {
           display(board);
           System.out.println();
           return;
       }

       if (row == board.length - 1 && col == board.length) {
           return;
       }


       if (col == board.length) {
           NQueen(board, knight, row + 1, 0);
           return;
       }


       if(isSafe(board, row, col)) {
           board[row][col] = true;
           NQueen(board, knight + 1, row, col + 1);
           board[row][col] = false;
       }

       NQueen(board, knight, row, col + 1);
    }



    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if(isValid(board,row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        if(isValid(board,row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if(isValid(board,row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        return true;
    }


    private static boolean isValid(boolean[][] board, int row, int col){
        if (row > 0 && row < board.length && col > 0 && col < board.length) {
            return true;
        }
        return false;
    }


    public static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for (boolean element: row) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }
}
