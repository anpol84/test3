import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintBoardTest {
    @Test
    public void testOutput1() {
        App.board = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String output = App.printBoard();
        assertEquals(
        "|---|---|---|\n" +
                "| 1 | 2 | 3 |\n" +
                "|-----------|\n" +
                "| 4 | 5 | 6 |\n" +
                "|-----------|\n" +
                "| 7 | 8 | 9 |\n" +
                "|-----------|\n"
                , output);
    }
    @Test
    public void testOutput2() {
        App.board = new String[]{"1", "2", "X", "4", "O", "O", "7", "8", "X"};
        String output = App.printBoard();
        assertEquals(
                "|---|---|---|\n" +
                        "| 1 | 2 | X |\n" +
                        "|-----------|\n" +
                        "| 4 | O | O |\n" +
                        "|-----------|\n" +
                        "| 7 | 8 | X |\n" +
                        "|-----------|\n"
                , output);
    }
}
