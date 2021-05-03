package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (

		features = "src/test/resources/features/",
		glue = {"steps"},
		//dryRun = true
		strict = true,
		monochrome = true
		,tags= "@codeChallenge"
		,plugin = {
				"pretty",
		        "html:target/cucumber-default-report",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		)

public class TestRunner {
}
