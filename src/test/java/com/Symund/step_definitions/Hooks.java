package com.Symund.step_definitions;

import com.Symund.utilities.BrowserUtils;
import com.Symund.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
Hook class will allow us to pass pre and post conditions for each scenario and each step
 */
public class Hooks {

    @Before (order = 1)//Before method coming from cucumber-java.Not from junit
    public void setupScenario(){

    }

    @Before(value = "@login",order = 2)//Before method coming from cucumber-java.Not from junit
    public void setupScenarioForLogins(){
        System.out.println("===This will only apply to Scenarios with @login ");
    }

    @Before(value = "@db",order = 0)//Before method coming from cucumber-java.Not from junit
    public void setupScenarioForDataBase(){
        System.out.println("===This will only apply to Scenarios with @db ");

    }


    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }



/*

    @After
    public void tearDownScenario(Scenario scenario)  {
       /* System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
        */

if (scenario.isFailed()) {
    byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot, "image/png", scenario.getName());
}

        BrowserUtils.waitFor(5);
        Driver.closeDriver();

       System.out.println("Driver closed");
    }



        @BeforeStep
    public void setupStep(){

    }

    @AfterStep
    public void afterStep(){

    }

}
