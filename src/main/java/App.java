import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static String[] board;
    public static String player;
    public static void main(String[] args) {

    }

    public static String currentResult() {
        String winner = winner();
        if (winner != null) {
            return winner;
        }
        if (isBoardFilled()) {
            return "Ничья";
        }
        return null;
    }
    public static Integer inputNumber(Scanner in) {
        try {
            int numInput = in.nextInt();
            if (numInput > 0 && numInput <= 9) {
                return numInput;
            }
        }
        catch (InputMismatchException ignored) {}
        return null;
    }
    public static String printBoard() {
        String output =
                "|---|---|---|\n" +
                "| " + board[0] + " | " + board[1] + " | " + board[2] + " |\n" +
                "|-----------|\n" +
                "| " + board[3] + " | " + board[4] + " | " + board[5] + " |\n" +
                "|-----------|\n" +
                "| " + board[6] + " | " + board[7] + " | " + board[8] + " |\n" +
                "|-----------|\n";

        System.out.println(output);

        return output;
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

    public static String makeMove(Scanner in) {
        Integer numInput = inputNumber(in);
        if (numInput == null) {
            System.out.println("Неверный ввод. Введите номер ячейки заново:");
            return null;
        }

        if (!board[numInput - 1].equals(String.valueOf(numInput))) {
            System.out.println("Ячейка занята, введите другой номер:");
            return null;
        }

        board[numInput - 1] = player;

        if (player.equals("X")) {
            player = "O";
        } else {
            player = "X";
        }

        printBoard();

        String currentResult = currentResult();
        if (currentResult == null) {
            System.out.println(player + " ходит, введите номер ячейки:");
        }
        return currentResult();
    }

}
