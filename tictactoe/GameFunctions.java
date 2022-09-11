package tictactoe;

public class GameFunctions {
    public static int gameStatus(String[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals("(X)") && board[i][1].equals("(X)") && board[i][2].equals("(X)"))
                return 1;
            else if (board[i][0].equals("(O)") && board[i][1].equals("(O)") && board[i][2].equals("(O)"))
                return 2;
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals("(X)") && board[1][i].equals("(X)") && board[2][i].equals("(X)"))
                return 1;
            else if (board[0][i].equals("(O)") && board[1][i].equals("(O)") && board[2][i].equals("(O)"))
                return 2;
        }

        if (board[0][0].equals("(X)") && board[1][1].equals("(X)") && board[2][2].equals("(X)"))
            return 1;
        else if (board[0][0].equals("(O)") && board[1][1].equals("(O)") && board[2][2].equals("(O)"))
            return 2;
        else if (board[0][2].equals("(X)") && board[1][1].equals("(X)") && board[2][0].equals("(X)"))
            return 1;
        else if (board[0][2].equals("(O)") && board[1][1].equals("(O)") && board[2][1].equals("(O)"))
            return 2;
        else return 0;
    }
}
