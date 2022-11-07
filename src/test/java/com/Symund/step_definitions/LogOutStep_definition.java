package com.Symund.step_definitions;

import com.Symund.pages.BasePage;
import com.Symund.pages.DashboardPage;
import com.Symund.pages.LoginPage;
import com.Symund.utilities.ConfigurationReader;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStep_definition {
LoginPage loginPage=new LoginPage();
BasePage dashboardPage=new DashboardPage();
    @Given("user is on loginpage")
    public void user_is_on_loginpage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }
    @When("user enters valid email {string} and password {string}")
    public void user_enters_valid_email_and_password(String email, String passsword) {
        loginPage.emailInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(passsword);
    }
    @Then("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginBtn.click();
    }
    @When("click to the profilePicture button on the right corner of the dashboard")
    public void click_to_the_profile_picture_button_on_the_right_corner_of_the_dashboard()  {
        dashboardPage.profilePictureBtn.click();

    }
    @When("click to logout button")
    public void click_to_logout_button()  {



        dashboardPage.logOutBtn.click();


    }
    @Then("verify that user is on login page")
    public void verify_that_user_is_on_login_page() {
        Assert.assertTrue(loginPage.loginBtn.isDisplayed());
    }

    @And("click to step back btn")
    public void clickToStepBackBtn() {
        Driver.getDriver().navigate().back();
    }
}
