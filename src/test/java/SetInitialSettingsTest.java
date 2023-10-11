import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SetInitialSettingsTest {

    @Test
    public void initialSettingsPlayer() {
        App.setInitialSettings();
        assertEquals("X", App.player);
    }

    @Test
    public void initialSettingsBoard() {
        App.setInitialSettings();
        for (int i = 0; i < 9; i++) {
            assertEquals(String.valueOf(i + 1), App.board[i]);
        }
    }
}
