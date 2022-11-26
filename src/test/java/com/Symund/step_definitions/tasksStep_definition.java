package com.Symund.step_definitions;

import com.Symund.pages.TasksPage;
import com.Symund.utilities.BrowserUtils;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class tasksStep_definition {
    TasksPage tasksPage=new TasksPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
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
    @Then("user goes to Completed list and verifies that the task {string} marked as completed is there")
    public void user_goes_to_completed_list_and_verifies_that_the_task_marked_as_completed_is_there(String string)  {
        tasksPage.completedModule.click();
        assertTrue(tasksPage.CreatedTask.isDisplayed());

    }

    @And("user clicks to checkbox btn left next to the {string} if it doesn't exists create one")
    public void userClicksToCheckboxBtnLeftNextToTheIfItDoesnTExistsCreateOne(String taskName) {


       try {
           assertTrue(tasksPage.CreatedTask.isDisplayed());

       }catch (NoSuchElementException e){
           tasksPage.addATaskInputBox.sendKeys(taskName+Keys.ENTER);

       }finally {
           tasksPage.completedCheckBoxBtn.click();
       }
    }

    @When("user creates a task {string} if it is not created")
    public void user_creates_a_task_if_it_is_not_created(String taskName) {
        try {
            assertTrue(tasksPage.CreatedTask.isDisplayed());

        }catch (NoSuchElementException e){
            tasksPage.addATaskInputBox.sendKeys(taskName+Keys.ENTER);

        }
    }
    @When("user clicks to star icon at the right side of task line")
    public void user_clicks_to_star_icon_at_the_right_side_of_task_line() {
        wait.until(ExpectedConditions.elementToBeClickable(tasksPage.starIcon));
       try {
           assertTrue(tasksPage.clickedStarIcon.isDisplayed());
       }catch (NoSuchElementException e){
           assertTrue(tasksPage.UnClickedStarIcon.isDisplayed());
           tasksPage.starIcon.click();
       }

    }
    @Then("verify that related task is on the important tasks list")
    public void verify_that_related_task_is_on_the_important_tasks_list() {

        tasksPage.importantList.click();
        assertTrue(tasksPage.CreatedTask.isDisplayed());
    }

    @When("Verify that user can see the number of uncompleted tasks")
    public void verifyThatUserCanSeeTheNumberOfUncompletedTasks() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='collection_current']//div[@class='app-navigation-entry__counter']")));
        assertTrue(tasksPage.numberOfUncompletedTasks.isDisplayed());
    }
}
