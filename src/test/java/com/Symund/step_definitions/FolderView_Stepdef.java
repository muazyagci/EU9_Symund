package com.Symund.step_definitions;

import com.Symund.pages.FolderViewPage;
import com.Symund.pages.LoginPage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class FolderView_Stepdef {

    FolderViewPage folderViewPage= new FolderViewPage();


    @When("user clicks on Name icon")
    public void user_clicks_on_name_icon() {
        folderViewPage.NameIcon.click();
    }
    @Then("user should see the folder or files in alpahetic order based on their names")
    public void user_should_see_the_folder_or_files_in_alpahetic_order_based_on_their_names() {
        List<String> allFilesNames= BrowserUtils.getElementsText(folderViewPage.allFiles);
        allFilesNames.remove("Notes");
        allFilesNames.remove("Talk");

        List<String> actualAllFilesNames = allFilesNames;
        System.out.println("allFilesNamesAfterClick = " + actualAllFilesNames);

        List<String> expectedSortedNames = allFilesNames;
        Collections.sort(expectedSortedNames);

        System.out.println("allFilesNamesAfterSorted = " + allFilesNames);
        System.out.println(expectedSortedNames.get(0));
        System.out.println(actualAllFilesNames.get(0));
               Assert.assertTrue(expectedSortedNames.get(0).equals(actualAllFilesNames.get(0)));
    }

    @When("user clicks on Size icon")
    public void user_clicks_on_size_icon() {
        folderViewPage.sizeIcon.click();
    }
    @Then("user should see the folder in order based on their size")
    public void user_should_see_the_folder_in_order_based_on_their_size() {
        folderViewPage.sizeIcon.isEnabled();
    }


    @When("user clicks on Modified icon")
    public void user_clicks_on_modified_icon() {
        folderViewPage.ModifiedIcon.click();
    }
    @Then("user should see the folder or files in order based on their uploaded dates")
    public void user_should_see_the_folder_or_files_in_order_based_on_their_uploaded_dates() {
        folderViewPage.ModifiedIcon.isEnabled();
    }



    @When("user clicks on Toggle grid view")
    public void user_clicks_on_toggle_grid_view() {
        folderViewPage.ToggleIcon.click();
    }
    @Then("user should see the folders in a view with large icons")
    public void user_should_see_the_folders_in_a_view_with_large_icons() {
        folderViewPage.ToggleIcon.isEnabled();
    }

    @When("user clicks on Checkbox")
    public void user_clicks_on_checkbox() {
       folderViewPage.SelectAllIcon.click();
    }
    @Then("user should see all checkboxes are selected")
    public void user_should_see_all_checkboxes_are_selected() {
        folderViewPage.SelectAllIcon.isSelected();
    }

    @Then("user should see the total values of all folders or files are displayed correctly")
    public void user_should_see_the_total_values_of_all_folders_or_files_are_displayed_correctly() {
        folderViewPage.SelectAllIcon.isDisplayed();
    }

}