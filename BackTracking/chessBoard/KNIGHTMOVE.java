public class KNIGHTMOVE {
    public static boolean IsSafe(char board[][], int row, int col) {
        // up left
        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (board[i][j] == 'H') {
                    return false;
                }
            }

        }
        // up rigth
        for (int i = row - 2; i >= 0; i--) {
            for (int j = col + 1; j < board.length; j++) {
                if (board[i][j] == 'H') {
                    return false;
                }
            }
        }
        //side right
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col -2; j >=0; j--) {
                if (board[i][j] == 'H') {
                    return false;
                }
            }
        }
        //side left
        for (int i = row + 1; i <board.length; i++) {
            for (int j = col -2; j >=0; j--) {
                if (board[i][j] == 'H') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Knigth(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (IsSafe(board, row, j)) {
                board[row][j] = 'H';
                Knigth(board, row + 1);
                board[row][j] = 'x';// backTraking
            }
        }
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
        // initilization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        Knigth(board, 0);

    }

}
