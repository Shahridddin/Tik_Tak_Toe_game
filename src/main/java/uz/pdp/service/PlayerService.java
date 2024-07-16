package uz.pdp.service;

public class PlayerService {

    private static final String stickerX = "\uD83D\uDE0A";
    private static final String stickerO = "\u2605";


    public void exteracted(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    System.out.print(i * 3 + j + 1);
                } else if (board[i][j] == 'O') {
                    System.out.print(stickerX);
                } else {
                    System.out.print(stickerO);
                }
                if (j < 2) {
                    System.out.print(" | ");
                } else if (i < 2) {
                    System.out.println();
                    System.out.println("---------");
                }
            }
            System.out.println(); // Print a newline after each row for better readability
        }
    }

    public boolean placeMove(char[][] board, int move, char sign) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '\0') {
            board[row][col] = sign;
            return true;
        }
        return false;
    }

    public boolean checkWin(char[][] board, char sign) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == sign && board[i][1] == sign && board[i][2] == sign) ||
                    (board[0][i] == sign && board[1][i] == sign && board[2][i] == sign)) {
                return true;
            }
        }
        if ((board[0][0] == sign && board[1][1] == sign && board[2][2] == sign) ||
                (board[0][2] == sign && board[1][1] == sign && board[2][0] == sign)) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }
}
