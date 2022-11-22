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
  
    @When("user clicks to Add a task to input box")
    public void user_clicks_to_add_a_task_to_input_box() {
        
    }
    
    @When("user clicks to list of tasks named {string}")
    public void user_clicks_to_list_of_tasks_named(String string) {
        
    }
    @When("user gives name to task as {string}")
    public void user_gives_name_to_task_as(String string) {
        
    }
    @Then("verify that {string} exists")
    public void verify_that_exists(String string) {
        
    }
}
