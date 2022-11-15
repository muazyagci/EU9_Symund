package com.Symund.step_definitions;

import com.Symund.pages.Contacts_GroupFunctionalityPage;
import com.Symund.utilities.BrowserUtils;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class Contact_GroupFunctionality_definition {
    Contacts_GroupFunctionalityPage contacts_groupFunctionalityPage = new Contacts_GroupFunctionalityPage();

    @Given("user enters valid username {string} and {string} password")
    public void user_enters_valid_username_and_password(String username, String password) {
        contacts_groupFunctionalityPage.userName.sendKeys(username);
        contacts_groupFunctionalityPage.password.sendKeys(password);
        contacts_groupFunctionalityPage.loginButton.click();


    }


    @Then("user should be able to land on dashboard")
    public void userShouldBeAbleToLandOnDashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @Given("user is on contacts module page")
    public void userIsOnContactsModulePage() {
        contacts_groupFunctionalityPage.navigateToModule("contacts");


    }

    @When("user clicks on new group and enters group name {string};")
    public void userClicksOnNewGroupAndEntersGroupName(String groupName) {
        contacts_groupFunctionalityPage.addGroupButton.click();
        BrowserUtils.sleep(2);
//       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
//     wait.until(ExpectedConditions.visibilityOf(contacts_groupFunctionalityPage.groupNameInput));
        contacts_groupFunctionalityPage.groupNameInput.click();
        contacts_groupFunctionalityPage.groupNameInput.sendKeys(groupName + Keys.ENTER);

    }

    @Then("user should be able to create a new group {string};")
    public void userShouldBeAbleToCreateANewGroup(String groupName) {
Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@title='"+groupName+"']")).isDisplayed());

    }

    @When("user clicks on the user {string} from All contacts")
    public void userClicksOnTheUserFromAllContacts(String contactName) {
        contacts_groupFunctionalityPage.Allcontacts.click();
        BrowserUtils
                .sleep(2);
        contacts_groupFunctionalityPage.navigateToContact(contactName);
    }

    @Then("user should be able to add existing group {string} to contact's groups")
    public void userShouldBeAbleToAddExistingGroupToContactSGroups(String groupName) {
        contacts_groupFunctionalityPage.Groups.click();

        Assert.assertEquals(contacts_groupFunctionalityPage.contactCounter.getAttribute("innerHTML"), 1);
    }

    @Then("user should be able to click on Birthday")
    public void userShouldBeAbleToClickOnBirthday() {
        contacts_groupFunctionalityPage.birthdayProperty.click();
    }

    @When("user clicks on add new property")
    public void userClicksOnAddNewProperty() {
        contacts_groupFunctionalityPage.propertyDropdown.click();

    }
}


