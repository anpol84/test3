import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WinnerTest {
    @Test
    public void testHorizontalWin() {
        String[] board = {"X", "X", "X", "", "", "", "", "", ""};
        App.board = board;
        assertEquals("X", App.winner());
    }
    @Test
    public void testVerticalWin() {
        String[] board = {"X", "", "", "X", "", "", "X", "", ""};
        App.board = board;
        assertEquals("X", App.winner());
    }
    @Test
    public void testDiagonalWin() {
        String[] board = {"", "", "X", "", "X", "", "X", "", ""};
        App.board = board;
        assertEquals("X", App.winner());
    }
    @Test
    public void testDraw() {
        String[] board = {"X", "0", "X", "X", "0", "0", "0", "X", "X"};
        App.board = board;
        assertNull(App.winner());
    }
    @Test
    public void testNoWin() {
        String[] board = {"X", "", "0", "", "0", "X", "", "0", "X"};
        App.board = board;
        assertNull(App.winner());
    }
    @Test
    public void testEmptyBoard() {
        String[] board = {"", "", "", "", "", "", "", "", ""};
        App.board = board;
        assertNull(App.winner());
    }
}
