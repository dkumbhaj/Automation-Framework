package Dictionary.StepDefinition;

import com.Utils.stringCheck;
import io.cucumber.java.en.*;
import static org.testng.Assert.*;

public class AnagramSteps {
    private String word1, word2;
    private boolean result;

    @Given("the words {string} and {string}")
    public void the_words_and(String w1, String w2) {
        this.word1 = w1;
        this.word2 = w2;
    }

    @When("I check if they are anagrams")
    public void i_check_if_they_are_anagrams() {
        result = stringCheck.areAnagrams(word1, word2);
    }

    @Then("the anagram should be true")
    public void the_result_should_be_true() {
        assertTrue(result);
    }

    @Then("the anagram should be false")
    public void the_result_should_be_false() {
        assertFalse(result);
    }
}
