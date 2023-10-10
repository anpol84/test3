import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static String[] board;
    public static String player;
    public static void main(String[] args) {

    }


    public static String winner() {
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };

            if (line.equals("XXX")) {
                return "X";
            }

            else if (line.equals("000")) {
                return "0";
            }


        }

        return null;
    }


    public static boolean isBoardFilled() {
        for (int a = 0; a < 9; a++) {
            if (Objects.equals(board[a], String.valueOf(a + 1))) {
                return false;
            }
        }

        return true;
    }
    public static void endTheGame(String winner) {
        if (winner.equalsIgnoreCase("Ничья")) {
            System.out.println("Ничья!");
        } else {
            System.out.println("Поздравляем! " + winner + " победил!");
        }
    }
}
