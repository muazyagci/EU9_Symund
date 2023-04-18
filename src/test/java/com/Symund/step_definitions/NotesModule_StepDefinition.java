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
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class NotesModule_StepDefinition {

    NotesModulePage notesModulePage = new NotesModulePage();


    @When("User clicks New note on the left side of the web page")
    public void user_clicks_new_note_on_the_left_side_of_the_web_page() {

       notesModulePage.newNoteButton.click();

    }
    @And("User writes {string} inside the new note")
    public void user_writes_inside_the_new_note(String string) {

        Driver.getDriver().navigate().refresh();

        Actions actions = new Actions(Driver.getDriver());
        actions.click(notesModulePage.threeDotButton).perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(notesModulePage.renameButton));

        notesModulePage.renameButton.click();


        notesModulePage.noteInput.sendKeys(Keys.CONTROL + "a");
        notesModulePage.noteInput.sendKeys(Keys.DELETE);

        actions.click(notesModulePage.noteInput).sendKeys(string).perform();
        actions.click(notesModulePage.noteInput).sendKeys(Keys.ENTER).perform();



    }



    @Then("User verifies that the title of the new note matches with {string}")
    public void userVerifiesThatTheTitleOfTheNewNoteMatchesWith(String title) {
        String expectedTitle = title;
        String actualTitle = notesModulePage.titleOfTheNoteDisplay.getAttribute("title");



        Assert.assertEquals(expectedTitle, actualTitle);

    }


    @When("User finds the note that just created and click three dots on the note")
    public void userFindsTheNoteThatJustCreatedAndClickThreeDotsOnTheNote() {

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


    @Then("user can see the {string} to favorites under Favorites tab inside Files Module")
    public void userCanSeeTheToFavoritesUnderFavoritesTabInsideFilesModule(String helloWorld) {

        String actualResult = notesModulePage.fileList.getText();

        String expectedResult = helloWorld;

        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("User clicks three dots at the top right of the page")
    public void userClicksThreeDotsAtTheTopRightOfThePage() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(notesModulePage.writeNote));

        Actions actions = new Actions(Driver.getDriver());
        actions.click(notesModulePage.writeNote).sendKeys("Hello World!").perform();

        notesModulePage.dropDownButton.click();
    }

    @And("user clicks Details from the drop-down list")
    public void userClicksDetailsFromTheDropDownList() {
        notesModulePage.detailButton.click();
    }

    @Then("user can see the number of letters and words that under the {string} title")
    public void userCanSeeTheNumberOfLettersAndWordsThatUnderTheTitle(String arg0) {

        String expectedText = "2 words, 12 characters";

        String actualText = notesModulePage.lettersAndWords.getText();

        Assert.assertEquals(expectedText, actualText);



    }



    @When("user clicks three dots at the top right of the page")
    public void user_clicks_three_dots_at_the_top_right_of_the_page() {
        notesModulePage.dropDownButton.click();
    }
    @And("User clicks Details from the drop-down list")
    public void user_clicks_details_from_the_drop_down_list() {
        notesModulePage.detailButton.click();

    }
    @And("user writes new category name {string} in the category field")
    public void userWritesNewCategoryNameInTheCategoryField(String category) {
        notesModulePage.categoryInput.sendKeys(category);
    }
    @And("user clicks the arrow or press Enter key")
    public void user_clicks_the_arrow_or_press_enter_key() {

        notesModulePage.categoryInput.sendKeys(Keys.ENTER);


    }
    @And("user clicks Categories on the left side of the page")
    public void user_clicks_categories_on_the_left_side_of_the_page() {

        Actions actions = new Actions(Driver.getDriver());
        actions.click(notesModulePage.categoryButton).perform();


    }



    @Then("user verifies that the new category {string} appears in the drop-down list")
    public void userVerifiesThatTheNewCategoryAppearsInTheDropDownList(String categoryName)  {
        String expectedResult = categoryName;

        String actualResult = notesModulePage.personalContains.getAttribute("title");

        Assert.assertEquals(expectedResult, actualResult );
    }


    @When("user clicks the three dots next to the note")
    public void userClicksTheThreeDotsNextToTheNote() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(notesModulePage.favThreeDotButton).perform();
    }

    @Then("user clicks Delete note from the drop-down list")
    public void userClicksDeleteNoteFromTheDropDownList() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(notesModulePage.deleteNote).perform();


    }

    @Then("user verifies that {string} note is deleted")
    public void userVerifiesThatNoteIsDeleted(String arg0) {

    String str = notesModulePage.isDeleted.getText();

    Assert.assertTrue(str.isEmpty());

    }
}
