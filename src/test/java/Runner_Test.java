
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        //  format = {"pretty", "html:target/html", "json:target/html/cucumber.json", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/featureFile/test.feature"},
//        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
//        features = {"/Users/Santo/Desktop/mfine_app_automation2/src/test/java/features/API.feature"},
        // snippets = SnippetType.CAMELCASE,
        strict = false,
        glue = "FlipkartTest",
        // plugin = {"json:target/cucumber-report/cucumber.json"})
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"})
public class Runner_Test {
}