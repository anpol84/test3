import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintInitialInfoStepdefs {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @When("I call printInitialInfo function")
    public void i_call_printInitialInfo_function() {
        App.setInitialSettings();
        System.setOut(new PrintStream(outContent));
        App.printInitialInfo();
    }

    @Then("it should print the initial information")
    public void it_should_print_the_initial_information() {
        String expectedOutput = "КРЕСТИКИ-НОЛИКИ\n";
        expectedOutput += "|---|---|---|\n" +
                "| 1 | 2 | 3 |\n" +
                "|-----------|\n" +
                "| 4 | 5 | 6 |\n" +
                "|-----------|\n" +
                "| 7 | 8 | 9 |\n" +
                "|-----------|\n\n";
        expectedOutput += "'X' ходит первым. Введи номер ячейки, в которое поместишь 'X':\n";

        assertEquals(expectedOutput, outContent.toString());
        System.setOut(originalOut);

    }

}


