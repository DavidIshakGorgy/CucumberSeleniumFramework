package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;
import tests.TestBase;
import utilities.Helper;

public class MyStepsDefination extends TestBase {

    private Scenario myScenario;

    @Before
    public void embedScreenshotStep(Scenario scenario) {
        myScenario = scenario;
    }

    @After
    public void i_take_a_screenshot() {
        if (myScenario.isFailed()) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, myScenario.getName());
        }
    }
}
