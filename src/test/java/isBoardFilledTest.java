import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class isBoardFilledTest {
    private String[] board;
    private boolean result;
    @Given("^The game board is not filled$")
    public void boardIsNotFilled() {
        board = new String[] { "1", "2", "X", "O", "5", "X", "O", "X", "9" };
    }
    @Given("^The game board is filled$")
    public void boardIsFilled() {
        board = new String[] { "X", "O", "X", "O", "X", "O", "X", "O", "X" };
    }
    @When("^the isBoardFilled function is called$")
    public void callIsBoardFilledFunction() {
        App.board = board;
        result = App.isBoardFilled();
    }
    @Then("^the result should be false$")
    public void assertIsBoardFilledFalse() {
        Assert.assertFalse(result);
    }
    @Then("^the result should be true$")
    public void assertIsBoardFilledTrue() {
        Assert.assertTrue(result);
    }
}
