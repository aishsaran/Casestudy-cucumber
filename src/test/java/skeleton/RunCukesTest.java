package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/skeleton/case4.feature","src/test/resources/skeleton/case1register.feature","src/test/resources/skeleton/case2login.feature","src/test/resources/skeleton/case3.feature"},
glue="skeleton",
plugin="json:target/cucumber.json")

public class RunCukesTest {
}
