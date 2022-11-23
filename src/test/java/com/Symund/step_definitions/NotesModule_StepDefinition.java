package com.Symund.step_definitions;

import com.Symund.pages.NotesModulePage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import com.Symund.utilities.Driver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class NotesModule_StepDefinition {

    NotesModulePage notesModulePage = new NotesModulePage();

    @When("User clicks New note on the left side of the web page")
    public void user_clicks_new_note_on_the_left_side_of_the_web_page() {
        //Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       notesModulePage.newNoteButton.click();
    }
    @And("User writes {string} inside the new note")
    public void user_writes_inside_the_new_note(String string) {
        //Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(notesModulePage.writeNote));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(notesModulePage.writeNote).click().sendKeys(string).perform();
        actions.click(notesModulePage.writeNote).sendKeys(Keys.ENTER).perform();

        //notesModulePage.newNoteButton.click();



        //wait.until(ExpectedConditions.visibilityOf(notesModulePage.titleOfTheNote));

    }






        //notesModulePage.writeNote.click();

        //notesModulePage.writeNote.sendKeys( string + Keys.ENTER);






    @Then("User verifies that the title of the new note matches with first words of his her new note")
    public void user_verifies_that_the_title_of_the_new_note_matches_with_first_words_of_his_her_new_note() {

        String expectedTitle = "Hello World!";
        String actualTitle = notesModulePage.titleOfTheNote.getText();

        Assert.assertEquals(expectedTitle, actualTitle);

    }


    @When("User finds the note that just created and click three dots on the note")
    public void userFindsTheNoteThatJustCreatedAndClickThreeDotsOnTheNote() {

        //((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", notesModulePage.threeDotButton);
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(notesModulePage.threeDotButton).click().perform();


    }

    @And("User clicks Add to favorites from the drop-down list")
    public void userClicksAddToFavoritesFromTheDropDownList() {

        notesModulePage.favoritesButton.click();
    }

    @And("User clicks Files at the top of the page.")
    public void userClicksFilesAtTheTopOfThePage() {

        notesModulePage.filesButton.click();
    }


    @And("clicks Favorites at the left side of the page.")
    public void clicksFavoritesAtTheLeftSideOfThePage() {

        notesModulePage.favButton2.click();
    }

    @Then("user can see the file newly added to favorites under Favorites tab inside Files Module")
    public void userCanSeeTheFileNewlyAddedToFavoritesUnderFavoritesTabInsideFilesModule() {

        String actualResult = notesModulePage.fileList.getText();

        String expectedResult = "Hello World!";

        Assert.assertEquals(expectedResult,actualResult);




    }


}
