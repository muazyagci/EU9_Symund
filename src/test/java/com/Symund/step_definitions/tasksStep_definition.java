package com.Symund.step_definitions;

import com.Symund.pages.TasksPage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tasksStep_definition {
    TasksPage tasksPage=new TasksPage();
    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String moduleName) {
        BrowserUtils.sleep(5);
        tasksPage.navigateToModule(moduleName);

    }

    @When("user clicks to add list button")
    public void userClicksToAddListButton() {
    tasksPage.addListBtn.click();
    }

    @And("user clicks to save button")
    public void userClicksToSaveButton() {
        tasksPage.saveListNameBtn.click();
    }

    @And("user enters list name {string}")
    public void userEntersListName(String listName) {
        tasksPage.addListInputBox.sendKeys(listName);
    }

    @And("verify that recently created list exists {string}")
    public void verifyThatRecentlyCreatedListExists(String listName) {

    }
}
