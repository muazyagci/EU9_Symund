package com.indeed.step_definitions;

import com.indeed.pages.LoginPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep_definition {
    LoginPage loginPage=new LoginPage();
    @When("user is on login page")
    public void user_is_on_login_page() {

        Driver.getDriver().get("https://qa.symund.com/");


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
       loginPage.enterKey.click();

    }
    @When("Invalid username should be entered {string}")
    public void invalid_username_should_be_entered(String username) {
       loginPage.emailInputBox.sendKeys(username);
    }
    @When("Invalid password should be entered {string}")
    public void invalid_password_should_be_entered(String password) {
         loginPage.passwordInputBox.sendKeys(password);
         
    }
    @When("Wrong username or password should be displayed")
    public void wrong_username_or_password_should_be_displayed() {
        if (loginPage.wrongPasswordMSG.isDisplayed()){
            System.out.println("Wrong password message is displayed");
        }else{
            System.exit(0);
        }

         
    }
    @When("Click Login button or hit enter key again without passing any username or password")
    public void click_login_button_or_hit_enter_key_again_without_passing_any_username_or_password() {
         loginPage.enterKey.click();
         
    }

    @Then("Please fill out this field message should be displayed")
    public void pleaseFillOutThisFieldMessageShouldBeDisplayed() {

    }
}
