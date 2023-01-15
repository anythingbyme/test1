package alg.arrays;

public class TicTacToe {

    public void play(char[][] board) {
        //scan row
        if (scanRow(board)) {
            return;
        }
        //scan col
        if(scanCol(board)) {
            return;
        }
        scanDiagnols(board);
        //scan diagnols
    }
    private boolean scanRow(char[][] board) {
        for (int i=0;i<board.length;i++) {
            int x = 0, y=0;
            for (int j=0;j<board[i].length;j++) {
                if (board[i][j] == 'x') {
                    x++;
                }
                else if (board[i][j] == 'y') {
                    y++;
                }
            }
            System.out.print("Row " + (i+1));
            if (x==3) {
                System.out.println(" X wins");
                return true;
            }
            else if (y == 3) {
                System.out.println(" Y wins");
                return true;
            }
            else {
                System.out.println(" No one wins");
            }
        }
        return false;
    }

    private boolean scanCol(char[][] board) {
        for (int i=0;i<board.length;i++) {
            int x = 0, y=0;
            for (int j=0;j<board[i].length;j++) {
                if (board[j][i] == 'x') {
                    x++;
                }
                else if (board[j][i] == 'y') {
                    y++;
                }
            }
            System.out.print("Col " + (i+1));
            if (x==3) {
                System.out.println(" X wins");
                return true;
            }
            else if (y == 3) {
                System.out.println(" Y wins");
                return true;
            }
            else {
                System.out.println(" No one wins");
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
        if ((a == 'x' && b == 'x' && c == 'x') || (d == 'x' && f == 'x')) {
            System.out.println("X wins (Diagnols)");
            return true;
        }
        else  if ((a == 'y' && b == 'y' && c == 'y') || (d == 'y' && f == 'y')) {
            System.out.println("Y wins (Diagnols)");
            return true;

        }
        else {
            System.out.println("No one wins (Diagnols)");
            return false;
        }
    }
}
