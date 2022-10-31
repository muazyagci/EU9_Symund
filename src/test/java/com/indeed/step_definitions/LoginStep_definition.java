package com.indeed.step_definitions;

import com.indeed.pages.LoginPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        if(!(loginPage.wrongPasswordMSG.isDisplayed())){
            throw new RuntimeException("Wrong password");
        }

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
         loginPage.enterKey.click();


        Assert.assertTrue(loginPage.passwordInputBox.getAttribute("validationMessage").contains("Please fill"));
         
    }
    @When("user enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.emailInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(password);

       
    }
    @Then("password must be seen as dots")
    public void password_must_be_seen_as_dots() {
       if (loginPage.passwordAsDots.isDisplayed()){

       }else {
           throw new RuntimeException();
       }
    }


    @Then("click to the eye button")
    public void click_to_the_eye_button() {
       loginPage.eyeBtn.click();
    }
    

    @When("user click to forgot password? link")
    public void user_click_to_forgot_password_link() {
loginPage.forgotPasswordLink.click();

if (!(loginPage.backToLoginBtn.isDisplayed())){
    throw new RuntimeException();
}
       
    }


    @When("user must see valid place holders on Username")
    public void user_must_see_valid_place_holders_on_username() {
       if (!(loginPage.emailPlaceHolder.isDisplayed())){
           throw new RuntimeException();
       }
       loginPage.enterKey.click();
       if (Driver.getDriver().findElement(By.xpath("//*[.='Please fill out this field.']")).isDisplayed()){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
    }
    @Then("user must see valid place holders on Password")
    public void user_must_see_valid_place_holders_on_password() {
        if (!(loginPage.passwordPlaceHolder.isDisplayed())){
            throw new RuntimeException();
        }

    }

    @Then("user should see the password explicitly")
    public void userShouldSeeThePasswordExplicitly() {
        if (loginPage.passwordAsText.isDisplayed()){

        }else {
            throw new RuntimeException();
        }

    }

    @Then("user must see Reset password button")
    public void userMustSeeResetPasswordButton() {
        if(loginPage.resetPasswordBtn.isDisplayed()){

        }else {
            throw new RuntimeException();
        }
    }
}
