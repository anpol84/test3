
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class isBoardFilledTest {
    private boolean result;
    private String[] board;

    @Given("^Допустим, игровая доска заполнена$")
    public void boardIsFilled() {
        board = new String[]{"X", "0", "X", "0", "X", "0", "X", "0", "X"};
    }
    @Given("Допустим, игровая доска не заполнена")
    public void boardIsEmpty() {
        board = new String[]{"1", "2", "3", "X", "5", "0", "X", "8", "9"};
    }
    @When("^вызывается функция isBoardFilled$")
    public void callIsBoardFilled() {
        App.board = board;
        result = App.isBoardFilled();

    }

    @Then("^результат должен быть false$")
    public void assertIsBoardFilledFalse() {
        Assert.assertFalse(result);
    }

    @Then("^результат должен быть true$")
    public void assertIsBoardFilledTrue() {
        Assert.assertTrue(result);
    }
}
