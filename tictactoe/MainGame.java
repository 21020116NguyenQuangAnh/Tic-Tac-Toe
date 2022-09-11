package tictactoe;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();

        board.createBoard();

        board.displayBoard();

        boolean player1 = true;
        boolean game_over = false;

        while (!game_over) {

            String choose = "()";

            if (player1) {
                System.out.println("Player 1 (X)'s turn:");
                choose = "(X)";
            } else {
                System.out.println("Player 2 (O)'s turn:");
                choose = "(O)";
            }

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.updateBoard(row, col, choose)) {
                player1 = !player1;
            }

            if (!board.isFull()) {
                if (GameFunctions.gameStatus(board.getBoard()) == 1) {
                    System.out.println("Player 1 has won.");
                    game_over = true;
                } else if (GameFunctions.gameStatus(board.getBoard()) == 2) {
                    System.out.println("Player 2 has won.");
                    game_over = true;
                }
            } else {
                System.out.println("Draw");
                game_over = true;
            }
            board.displayBoard();
        }
    }
}