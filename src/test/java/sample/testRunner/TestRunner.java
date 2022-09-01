package sample.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Feature/"},
        glue = {"sample/steps"},
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json", "pretty"},
        tags = "@Product",
        monochrome = true
)
public class TestRunner {
}
