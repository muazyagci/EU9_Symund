package com.Symund.step_definitions;

import com.Symund.pages.FolderViewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FolderView_Stepdef {

    FolderViewPage folderViewPage= new FolderViewPage();

    @When("user clicks on Name icon")
    public void user_clicks_on_name_icon() {
        folderViewPage.NameIcon.click();
    }
    @Then("user should see the folder or files in alpahetic order based on their names")
    public void user_should_see_the_folder_or_files_in_alpahetic_order_based_on_their_names() {
       folderViewPage.check_fileNameOrder();
    }

    @When("user clicks on Size icon")
    public void user_clicks_on_size_icon() {
        folderViewPage.sizeIcon.click();
    }
    @Then("user should see the folder in order based on their size")
    public void user_should_see_the_folder_in_order_based_on_their_size() {
        folderViewPage.check_SizeNameOrder();
    }

    @When("user clicks on Modified icon")
    public void user_clicks_on_modified_icon() {
        folderViewPage.ModifiedIcon.click();
    }
    @Then("user should see the folder or files in order based on their uploaded dates")
    public void user_should_see_the_folder_or_files_in_order_based_on_their_uploaded_dates() {
        folderViewPage.check_ModifiedOrder();
    }
    @When("user clicks on Toggle grid view")
    public void user_clicks_on_toggle_grid_view() {
        folderViewPage.ToggleIcon.click();
    }
    @Then("user should see the folders in a view with large icons")
    public void user_should_see_the_folders_in_a_view_with_large_icons() {
        folderViewPage.check_ToggleView();
    }
    @When("user clicks on Checkbox")
    public void user_clicks_on_checkbox() {
       folderViewPage.checkSelectAllCheckBox();
    }
    @Then("user should see the total counts of all folders or files are displayed correctly")
    public void user_should_see_the_total_values_of_all_folders_or_files_are_displayed_correctly() {
        folderViewPage.verifyTotalCountsOfFolderFiles();
    }

}