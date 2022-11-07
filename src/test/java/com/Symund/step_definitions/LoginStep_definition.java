package com.Symund.step_definitions;

import com.Symund.pages.DashboardPage;
import com.Symund.pages.LoginPage;
import com.Symund.utilities.ConfigurationReader;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep_definition {
    LoginPage loginPage = new LoginPage();

    @When("user is on login page")
    public void user_is_on_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));


    }

    @When("user clicks to email input box and enter email {string}")
    public void user_clicks_to_email_input_box_and_enter_email(String ValidEmail) {
        loginPage.emailInputBox.sendKeys(ValidEmail);
    }

    @When("user clicks to password input box and enter password {string}")
    public void user_clicks_to_password_input_box_and_enter_password(String password) {

        loginPage.passwordInputBox.sendKeys(password);

    }

    @Then("Click Login button or hit enter key")
    public void click_login_button_or_hit_enter_key() {
        loginPage.loginBtn.click();
        Assert.assertTrue(loginPage.wrongPasswordMSG.isDisplayed());
    }

    @When("Invalid username should be entered {string}")
    public void invalid_username_should_be_entered(String username) {
        loginPage.emailInputBox.sendKeys(username);
    }

    @When("Invalid password should be entered {string}")
    public void invalid_password_should_be_entered(String password) {
        loginPage.passwordInputBox.sendKeys(password);
    }


    @When("Click Login button or hit enter key again without passing any username or password")
    public void click_login_button_or_hit_enter_key_again_without_passing_any_username_or_password() {
        loginPage.loginBtn.click();
        String validationMessage = loginPage.passwordInputBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill in this field.");
    }

    @When("user enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.emailInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(password);
    }

    @Then("password must be seen as dots")
    public void password_must_be_seen_as_dots() {
        Assert.assertEquals("password", loginPage.passwordInputBox.getAttribute("type"));
    }

    @Then("click to the eye button")
    public void click_to_the_eye_button() {
        loginPage.eyeBtn.click();
    }


    @When("user click to forgot password? link")
    public void user_click_to_forgot_password_link() {

        loginPage.forgotPasswordLink.click();

        Assert.assertTrue(loginPage.backToLoginBtn.isDisplayed());


    }


    @When("user must see valid place holders on Username")
    public void user_must_see_valid_place_holders_on_username() {
        Assert.assertTrue(loginPage.emailPlaceHolder.isDisplayed());


    }

    @Then("user must see valid place holders on Password")
    public void user_must_see_valid_place_holders_on_password() {
        Assert.assertTrue(loginPage.passwordPlaceHolder.isDisplayed());


    }

    @Then("user should see the password explicitly")
    public void userShouldSeeThePasswordExplicitly() {
        Assert.assertTrue(loginPage.passwordAsText.isDisplayed());


    }

    @Then("user must see Reset password button")
    public void userMustSeeResetPasswordButton() {
        Assert.assertTrue(loginPage.resetPasswordBtn.isDisplayed());

    }

    @Then("Click Login button")
    public void clickLoginButton() {
        loginPage.loginBtn.click();
    }

    @Then("verify that user is on dashboard")
    public void verifyThatUserIsOnDashboard() {
        Assert.assertTrue(new DashboardPage().dashboardBtn.isDisplayed());

    }

    @Then("user clicks to login button and lands on dashboard")
    public void userClicksToLoginButtonAndLandsOnDashboard() {

        loginPage.loginBtn.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard - Symund - QA");


    }
}
