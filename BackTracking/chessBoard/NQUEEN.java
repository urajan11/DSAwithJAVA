public class NQUEEN { // Tc= O(n!)
    public static boolean isSafe(char board[][], int row, int colm) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][colm] == 'Q') {
                return false;
            }
        }
        // left up
        for (int i = row - 1, j = colm - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Rigth up
        for (int i = row - 1, j = colm + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    // public static void ChessBoard(char board[][], int row)
    public static boolean ChessBoard(char board[][], int row) { // Print single chessBoard
        // base case
        if (row == board.length) {
            count++;
            // printBoard(board);
            // return;
            return true;
        }
        // column loop
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (ChessBoard(board, row + 1)) {// Function call
                    return true;
                }
                board[row][col] = 'x'; // backTracking
            }
        }
        return false;

    }

    public static void printBoard(char board[][]) {
        System.out.println("********Chess Board*********");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        // print single solution of mutiple ans
        if (ChessBoard(board, 0)) {
            System.out.println("solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
        // ChessBoard(bord, 0);
        // System.out.println("Totol No of ways n queen: " + count);
    }

}
