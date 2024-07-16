package uz.pdp;

import uz.pdp.service.PlayerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        PlayerService playerService = new PlayerService();
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';

        while (true) {
            playerService.exteracted(board);
            System.out.println();
            System.out.println("O'yinchi " + currentPlayer + ", yurishingizni kiriting (1 dan 9 gacha bo'lgan raqam): ");
            int move = scanner.nextInt();

            if (playerService.placeMove(board, move, currentPlayer)) {
                if (playerService.checkWin(board, currentPlayer)) {
                    playerService.exteracted(board);
                    System.out.println();
                    System.out.println("O'yinchi " + currentPlayer + " g'olib bo'ldi!");
                    break;
                }
                if (playerService.isBoardFull(board)) {
                    playerService.exteracted(board);
                    System.out.println();
                    System.out.println("Durang!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Notog'ri yurish, qayta urinib ko'ring.");
            }
        }
        scanner.close();
    }
}
