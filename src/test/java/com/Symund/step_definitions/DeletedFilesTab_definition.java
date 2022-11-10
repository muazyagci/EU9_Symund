package com.Symund.step_definitions;

import com.Symund.pages.FilesPage;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;

public class DeletedFilesTab_definition {
    WebDriver driver = Driver.getDriver();
    FilesPage filesPage = new FilesPage();


    @When("User been Allfiles page")
    public void user_been_allfiles_page() {
        Assert.assertEquals(driver.getTitle(), "Files - Symund - QA");
    }

    @And("User deletes {string}")
    public void userDeletes(String file) throws InterruptedException {
        Actions actions =new Actions(driver);
        WebElement deleteOrderNumber1= filesPage.navigateToFolders(file);
        actions.contextClick(deleteOrderNumber1).perform();
        filesPage.deleteButton.click();


    }
    @When("User switch to DeletedFiles page")
    public void user_switch_to_deleted_files_page() {
        filesPage.deletedFiles.click();
    }

    @When("User sorts files")
    public void user_sorts_files() {
      filesPage.deletedOrder.click();

    }
    @Then("User should see last deleted {string} first")
    public void userShouldSeeLastDeletedFirst(String file) {
        String firstDeletedFolderName= filesPage.deletedFileQueue(1).getAttribute("data-path");
        Assert.assertEquals(firstDeletedFolderName,file);

    }










    @Then("User should be able to order the all deleted {string} by newest to oldest or visa versa")
    public void userShouldBeAbleToOrderTheAllDeletedByNewestToOldestOrVisaVersa(String file) throws InterruptedException {
        filesPage.deletedOrder.click();
        String firstDeletedFolderName= filesPage.deletedFileQueue(1).getAttribute("data-path");
        Assert.assertEquals(firstDeletedFolderName,file);
        filesPage.deletedOrder.click();
        String folderSize = filesPage.deletedFolderSize.getText();
       String sample = folderSize;
       char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        String size = String.valueOf(sb);
        int sizes = Integer.parseInt(size);

        Thread.sleep(1500);
        String firstDeletedFolderNameOrderLast = filesPage.deletedFileQueue(sizes).getAttribute("data-path");
        Assert.assertEquals(firstDeletedFolderNameOrderLast,file);
    }








    @And("User sorts files based on Names")
    public void userSortsFilesBasedOnNames() {
        filesPage.OrderByNameButton.click();

    }

    @Then("User should be able to order alphabetically all the deleted files based on their names")
    public void userShouldBeAbleToOrderAlphabeticallyAllTheDeletedFilesBasedOnTheirNames() {

        String folderSize = filesPage.deletedFolderSize.getText();
        String sample = folderSize;
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        String size = String.valueOf(sb);
        int sizes = Integer.parseInt(size);

        String[] folders = new String[sizes];
        for (int i = 0; i < sizes; i++) {
          folders[i] = filesPage.deletedFileQueue((i+1)).getAttribute("data-path");
        }
        String[] folders1 = new String[sizes];
        for (int i = 0; i < sizes; i++) {
            folders1[i] = filesPage.deletedFileQueue((i+1)).getAttribute("data-path");
        }
        Arrays.sort(folders);

        System.out.println("Arrays.toString(folders1) = " + Arrays.toString(folders1));
        System.out.println("Arrays.toString(folders) = " + Arrays.toString(folders));

        Boolean equals = Arrays.equals(folders1,folders);

        Assert.assertTrue(equals);


    }



    @And("User select {string}")
    public void userSelect(String arg0) {
        filesPage.selectDeletedFolder(arg0).click();

    }


    @And("User click to three dots button")
    public void userClickToThreeDotsButton() {
        filesPage.threeDots.click();

    }


    @Then("User should be able to delete any deleted file permenantly")
    public void userShouldBeAbleToDeleteAnyDeletedFilePermenantly() throws InterruptedException {
        String folderSize = filesPage.deletedFolderSize.getText();
        String sample = folderSize;
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        String size = String.valueOf(sb);
        int sizes = Integer.parseInt(size);

        filesPage.deletePermanent.click();



        Thread.sleep(2000);

        String folderSize1 = filesPage.deletedFolderSize.getText();
        char[] chars1 = folderSize1.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for(char d : chars1){
            if(Character.isDigit(d)){
                sb1.append(d);
            }
        }
        String size1 = String.valueOf(sb1);
        int sizes1 = Integer.parseInt(size1);
        System.out.println("sizes1 = " + sizes1);


        Assert.assertNotEquals(sizes1,sizes);






    }


    @Then("User should be restore to deleted {string}")
    public void userShouldBeRestoreToDeleted(String arg0) {
filesPage.restoreButton.click();
filesPage.AllFiles.click();
filesPage.navigateToFolders("Program").isDisplayed();



    }
}

