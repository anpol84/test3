import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EndTheGameTest {
    private String winner;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanup() {
        System.setOut(System.out);
    }

    @Given("^The winner is \"(.*)\"$")
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @When("^the endTheGame function is called$")
    public void callEndTheGameFunction() {
        App.endTheGame(winner);
    }

    @Then("^it should print \"(.*)\"$")
    public void assertOutput(String expectedOutput) {
        String actualOutput = outputStream.toString().trim();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
