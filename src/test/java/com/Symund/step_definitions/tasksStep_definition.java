package com.Symund.step_definitions;

import com.Symund.pages.TasksPage;
import io.cucumber.java.en.Then;

public class tasksStep_definition {
    TasksPage tasksPage=new TasksPage();
    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String moduleName) {
        tasksPage.navigateToModule(moduleName);
    }
}
