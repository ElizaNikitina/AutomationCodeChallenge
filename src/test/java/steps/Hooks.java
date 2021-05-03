package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
	
	/**
	 * Opening and setting up the browser before running the scenarios
	 */
	@Before("not @TestOnUI")
	public void start() {

		setUp();
	}

	/**
	 * Ending the scenario with closing the browser, making the screenshot and
	 * storing it in correct folder whether it's passed or failed
	 * 
	 * @param scenario
	 */
	@After
	public void stop(Scenario scenario) {
		byte[] pic;
		if (scenario.isFailed()) {
			pic = CommonMethods.takeScreenshot("failedScenarios/" + scenario.getName());
		} else {
			pic = CommonMethods.takeScreenshot("passedScenarios/" + scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());

		tearDown();
	}
}
