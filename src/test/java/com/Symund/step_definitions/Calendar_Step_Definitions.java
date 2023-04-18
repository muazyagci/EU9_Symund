package com.Symund.step_definitions;

import com.Symund.pages.CalendarPage;
import com.Symund.utilities.ConfigurationReader;
import com.Symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jfr.Timespan;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Calendar_Step_Definitions {

    CalendarPage calendarPage = new CalendarPage();

    @When("user clicks on menutoggle next to today button")
    public void user_clicks_on_menutoggle_next_to_today_button() {
        calendarPage.menuToggle.click();
    }
    @And("user clicks on day button")
    public void user_clicks_on_day_button() {
        calendarPage.dayButton.click();
    }


    @Then("user displays daily calendar view")
    public void userDisplaysDailyCalendarView() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toLowerCase().contains("day"));
    }

    @And("user clicks on week button")
    public void userClicksOnWeekButton() {
        calendarPage.weekButton.click();
    }

    @Then("user displays weekly calendar view")
    public void userDisplaysWeeklyCalendarView() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toLowerCase().contains("week"));
    }

    @And("user clicks on month button")
    public void userClicksOnMonthButton() {
        calendarPage.monthButton.click();
    }

    @Then("user displays monthly calendar view")
    public void userDisplaysMonthlyCalendarView() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().toLowerCase().contains("month"));
    }

    @And("user clicks on new event button")
    public void userClicksOnNewEventButton() {
        calendarPage.newEventButton.click();
    }

    @And("user inserts title")
    public void userInsertsTitle() {
        calendarPage.title.sendKeys("new event");
    }

    @And("user selects the beginning date")
    public void userSelectsTheBeginningDate() throws InterruptedException {
        calendarPage.beginningDate.click();
        calendarPage.nextMonth.click();
        calendarPage.firstSunday.click();
        Thread.sleep(5000);
    }



    @And("user clicks on Save button")
    public void userClicksOnSaveButton() {
        calendarPage.saveButton.click();
    }

    @Then("user sees the new event through the Monthly Calendar view")
    public void userSeesTheNewEventThroughTheMonthlyCalendarView() {
        Assert.assertTrue(calendarPage.newEventDisplay.isDisplayed());
    }

    @And("user opens next month's calendar")
    public void userOpensNextMonthSCalendar() {
        calendarPage.nextMonthButton.click();
    }

    @When("user clicks on the created event")
    public void userClicksOnTheCreatedEvent() {
        calendarPage.newEventDisplay.click();
    }

    @And("user clicks on more button")
    public void userClicksOnMoreButton() {
        calendarPage.moreButton.click();
    }

    @And("user clicks on toggle")
    public void userClicksOnToggle() {
        calendarPage.toggle.click();
    }

    @Then("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        calendarPage.deleteButton.click();
    }
}
