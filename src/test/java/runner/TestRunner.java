package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        publish = true,
        features = {"src/main/resources/features"},
        glue = {"stepsDefinitions", "framework"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
			"junit:target/cucumber-reports/Cucumber.xml",
			"html:target/cucumber-reports/Cucumber.html"},
	monochrome = true,
        tags =  "@PRUEBA2"
)
public class TestRunner {
}

