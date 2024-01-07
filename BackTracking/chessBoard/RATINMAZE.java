public class RATINMAZE {
    public static boolean safecase(int maze[][], int row, int col) {
        // down
        for (int i = row; i < 4; i++) {
            if (maze[i][col] == 0) {
                return false;
            }
        }
        // rigth
        for (int j = col; j < 4; j++) {
            if (maze[row][j] == 0) {
                return false;
            }
        }
        // up
        for (int i = 4; i >= 0; i--) {
            if (maze[i][col] == 0) {
                return false;
            }
        }
        // left
        for (int j = 4; j >= 0; j--) {
            if (maze[row][j] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Chakraview(int maze[][], int row) {
        // base case
        if (row == 3 ) {
            return true;
        }
        // recursion
        for (int j = 0; j < 4; j++) {
            if (safecase(maze, row,j)) {
                maze[row][j] = 0;
                Chakraview(maze, row + 1);
                maze[row][j] = 1;// backTrack
            }
        }
        return false;
    }

    public static void printMaze(int maze[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        Chakraview(maze, 0);
        printMaze(maze);

    }
}
