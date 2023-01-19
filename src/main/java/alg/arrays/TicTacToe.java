package alg.arrays;

public class TicTacToe {

    public boolean play(char[][] board) {
        return  scanRow(board) || scanCol(board) || scanDiagnols(board);
    }
    private boolean scanRow(char[][] board) {
        for (int i=0;i<board.length;i++) {
            int x = 0, y=0;
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println(board[i][0] + " wins ");
                return true;
            }
            else {
                System.out.println(" No one wins (row)=" + (i+1));
            }
        }
        return false;
    }

    private boolean scanCol(char[][] board) {
        for (int i=0;i<board.length;i++) {
            int x = 0, y=0;
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                System.out.println(board[0][i] + " wins ");
                return true;
            }
            else {
                System.out.println(" No one wins (col)=" + (i+1));
            }
        }
        return false;
    }

    private boolean scanDiagnols(char[][] board) {
        char a = board[0][0];
        char b = board[1][1];
        char c = board[2][2];
        char d = board[0][2];
        char f = board[2][0];
        int x = 0, y=0;
        if (a == b && b == c || d == b && b == f) {
            System.out.println(b + " wins (Diagnols)");
            return true;
        }
        else {
            System.out.println("No one wins (Diagnols)");
            return false;
        }
    }
}
