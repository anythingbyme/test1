package alg.arrays;

import java.util.Arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //validate each 3x3
        //validate each row
        //validte each column

        //first row, first column
        //scan ith row, jth col

        for (int i=0;i<board.length; i++) {
            for (int j=0;j<board[i].length;j++) {
                if (!validateRow(board, i)) {
                    System.out.printf("\nNot valid row: %d",(i+1));
                    return false;
                }
                if (!validateCol(board, j)) {
                    System.out.printf("\nNot valid col: %d ",(j+1));
                    return false;
                }
            }
        }

        return true;
    }

    private boolean validateRow(char[][] board, int row) {
        int[] chars = new int[9];
        int k = 0;
        for (int i = 0; i < board[row].length;i++) {
                chars[k++] = board[row][i];
        }
        int[] digitsOnly = Arrays.stream(chars).filter(Character::isDigit).toArray();
        int[] unique = Arrays.stream(digitsOnly).distinct().toArray();
        return Arrays.equals(digitsOnly, unique);
    }

    private boolean validateCol(char[][] board, int col) {
        int[] chars = new int[9];
        int k = 0;

        for (int j = 0; j < board.length ; j++) {
                chars[k++] = board[j][col];
        }

        int[] digitsOnly = Arrays.stream(chars).filter(Character::isDigit).toArray();
        int[] unique = Arrays.stream(digitsOnly).distinct().toArray();
        return Arrays.equals(digitsOnly, unique);
    }
}
