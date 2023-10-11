import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MakeMoveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void notValidInput(){
        String result = App.makeMove(new Scanner("10"));
        assertNull(result);
        assertEquals("Неверный ввод. Введите номер ячейки заново:\n", outContent.toString());
    }

    @Test
    public void fieldIsNotEmpty(){
        App.board = new String[]{"X", "2", "3", "4", "5", "6", "7","8","9"};
        String result = App.makeMove(new Scanner("1"));
        assertNull(result);
        assertEquals("Ячейка занята, введите другой номер:\n", outContent.toString());
    }

    @Test
    public void correctInput(){
        App.board = new String[]{"X", "2", "3", "4", "5", "6", "7","8","9"};
        App.player = "0";
        String result = App.makeMove(new Scanner("2"));
        Assertions.assertEquals(
                "|---|---|---|\n" +
                        "| X | 0 | 3 |\n" +
                        "|-----------|\n" +
                        "| 4 | 5 | 6 |\n" +
                        "|-----------|\n" +
                        "| 7 | 8 | 9 |\n" +
                        "|-----------|\n\n" +
                        "X ходит, введите номер ячейки:\n",
                outContent.toString());
        assertEquals("X", App.player);
        assertNull(result);
    }

}
