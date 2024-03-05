package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinition",
        tags = "@Test1",
        plugin = {"pretty", "html:target/RegressionReport.html"}

)

public class RunTest {
}

