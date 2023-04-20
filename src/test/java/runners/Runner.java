package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"rerun:target/failed_scenarios.txt",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        monochrome = true,
        glue = "steps",
        tags = "@trendyol",
        dryRun = false
)

public class Runner {

}

