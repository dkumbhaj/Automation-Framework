package Dictionary.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "Dictionary.StepDefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "testng:target/cucumber-reports/testng-cucumber.xml"
        },
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

}

