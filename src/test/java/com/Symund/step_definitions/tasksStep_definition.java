package com.Symund.step_definitions;

import com.Symund.pages.TasksPage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

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
        assertTrue( tasksPage.listOftasks.isDisplayed());
    }

    
    @When("user clicks to list of tasks named {string}")
    public void user_clicks_to_list_of_tasks_named(String taskName) {
        tasksPage.listOftasks.click();
    }
    @When("user gives name to task as {string}")
    public void user_gives_name_to_task_as(String taskName) {
        tasksPage.addATaskInputBox.sendKeys(taskName+ Keys.ENTER);
    }
    @Then("verify that {string} exists")
    public void verify_that_exists(String taskName) {
        assertTrue(tasksPage.CreatedTask.isDisplayed());
    }
}
