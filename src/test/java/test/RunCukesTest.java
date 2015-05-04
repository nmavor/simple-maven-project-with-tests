import cucumber.api.CucumberOptions;  
import cucumber.api.junit.Cucumber;  
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt", "json:target/cucumber/cucumber-json-report.json","junit:target/cucumber/cucumber.xml"})
public class RunCukesTest {  
}
