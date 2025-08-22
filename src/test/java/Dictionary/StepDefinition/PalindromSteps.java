package Dictionary.StepDefinition;

import com.Utils.stringCheck;
import io.cucumber.java.en.*;
import static org.testng.Assert.*;

public class PalindromSteps {
    private String input;
    private boolean result;

    @Given("the input word {string}")
    public void the_input_word(String word) {
        this.input = word;
    }

    @When("I check if it is palindrome")
    public void i_check_if_it_is_palindrome() {
        result = stringCheck.isPalindrome(input);
    }

    @Then("the palindrome should be true")
    public void the_result_should_be_true() {
        assertTrue(result);
    }

    @Then("the palindrome should be false")
    public void the_result_should_be_false() {
        assertFalse(result);
    }
}

