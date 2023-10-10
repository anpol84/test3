import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentResultTest {
    private String result;

    @Given("the game has a winner")
    public void theGameHasAWinner() {
        App.board = new String[]{"X", "X", "X", "", "", "", "", "", ""};
    }
    @When("I check the current result")
    public void iCheckTheCurrentResult() {
        result = App.currentResult();
    }
    @Then("the function should return the winner")
    public void theFunctionShouldReturnTheWinner() {
        assertNotNull(result);
    }
    @Given("the game has no winner and board is filled")
    public void theGameHasNoWinnerAndBoardIsFilled() {
        App.board = new String[]{"X", "X", "O", "O", "O", "X", "X", "X", "O"};
    }
    @Then("the function should return draw")
    public void theFunctionShouldReturnDraw() {
        assertEquals("Ничья", result);
    }
    @Given("the game has no winner and the board is not filled")
    public void theGameHasNoWinnerAndTheBoardIsNotFilled() {
        App.board = new String[]{"X", "X", "O", "O", "O", "X", "X", "X", "1"};
    }
    @Then("the function should return null")
    public void theFunctionShouldReturnNull() {
        assertNull(result);
    }
}