import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InputNumberTest {
    private Scanner scanner;
    private Integer result;

    @Given("I have a scanner")
    public void iHaveAScanner() {
        String input = "5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(in);
    }
    @When("I input a valid number between 1 and 9")
    public void iInputAValidNumberBetween1And9() {
        result = App.inputNumber(scanner);
    }
    @Then("the function should return that number")
    public void theFunctionShouldReturnThatNumber() {
        assertNotNull(result);
        assertEquals(Integer.valueOf(5), result);
    }
    @When("I input an invalid number less than 1")
    public void inputLessThanNeeded() {
        String input = "0";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(in);
        result = App.inputNumber(scanner);
    }
    @When("I input an invalid number more than 9")
    public void inputMoreThanNeeded() {
        String input = "10";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(in);
        result = App.inputNumber(scanner);
    }
    @Then("the function should return null1")
    public void theFunctionShouldReturnNull() {
        assertNull(result);
    }
}