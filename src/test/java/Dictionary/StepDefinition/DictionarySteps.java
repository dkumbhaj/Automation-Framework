package Dictionary.StepDefinition;

import com.Utils.APIservice;
import io.cucumber.java.en.*;
import static org.testng.Assert.*;

public class DictionarySteps {
        private String word;
        private boolean result;
        private final APIservice apiservice = new APIservice();

        @Given("a word {string}")
        public void a_word(String word) {
            this.word = word;
        }

        @When("I check the dictionary")
        public void i_check_the_dictionary() {
            result = APIservice.isValidWord(word);
        }

        @Then("it should be a valid word")
        public void it_should_be_a_valid_word() {
            assertTrue(result);
        }

        @Then("it should not be a valid word")
        public void it_should_not_be_a_valid_word() {
            assertFalse(result);
        }
}
