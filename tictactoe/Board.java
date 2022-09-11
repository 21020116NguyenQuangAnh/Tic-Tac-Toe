package tictactoe;

import java.util.Objects;

public class Board {

    private String[][] board = new String[3][3];

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "()";
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean updateBoard(int row, int col, String choose) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col].equals("()")) {
                board[row][col] = choose;
                return true;
            }
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("()")) return false;
            }
        }
        return true;
    }


}
