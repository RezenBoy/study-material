import java.util.Scanner;

public class TicTacToe {
    public static void printBoard(char[][] board) {
        System.out.println();
        for (char[] row : board) {
            for (char cell : row) System.out.print(cell + " | ");
            System.out.println("\n---------");
        }
    }

    public static boolean checkWin(char[][] b, char mark) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == mark && b[i][1] == mark && b[i][2] == mark) return true;
            if (b[0][i] == mark && b[1][i] == mark && b[2][i] == mark) return true;
        }
        return (b[0][0] == mark && b[1][1] == mark && b[2][2] == mark) ||
               (b[0][2] == mark && b[1][1] == mark && b[2][0] == mark);
    }

    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner sc = new Scanner(System.in);
        char player = 'X';
        int moves = 0;

        while (moves < 9) {
            printBoard(board);
            System.out.println("Player " + player + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter col (0-2): ");
            int col = sc.nextInt();

            if (board[row][col] != ' ') {
                System.out.println("Cell already taken!");
                continue;
            }

            board[row][col] = player;
            moves++;

            if (checkWin(board, player)) {
                printBoard(board);
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        printBoard(board);
        System.out.println("It's a draw!");
        sc.close();
    }
}
