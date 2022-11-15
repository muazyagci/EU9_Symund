package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//div[@class='v-popover']//div[@class='trigger']//button[@aria-label='Actions'])[1]")
    public WebElement menuToggle;

    @FindBy (xpath = "//ul[@tabindex='-1']/li/button[1]")
    public WebElement dayButton;

    @FindBy (xpath = "//span[.='Week']")
    public WebElement weekButton;

    @FindBy (xpath = "//span[.='Month']")
    public WebElement monthButton;

    @FindBy (xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy (xpath = "//input[@placeholder='Event title']")
    public WebElement title;

    @FindBy (xpath = "(//div[@class='property-title-time-picker']/div/div/div/input)[1]")
    public WebElement beginningDate;

    @FindBy (xpath="//button[@class='mx-btn mx-btn-text mx-btn-icon-right']")
    public WebElement nextMonth;

    @FindBy (xpath = "//td[@data-row-col='1,0']")
    public WebElement firstSunday;

    @FindBy (xpath = "(//div[@class='property-title-time-picker']/div/div/div/input)[2]")
    public WebElement endDate;

    @FindBy (xpath = "//td[@data-row-col='1,1']")
    public WebElement firstMonday;

    @FindBy (xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy (xpath = "//button[@class='datepicker-button-section__next button icon icon-rightarrow']")
    public WebElement nextMonthButton;

    @FindBy (xpath = "//a[@class='fc-daygrid-event fc-daygrid-dot-event fc-event fc-event-draggable fc-event-resizable fc-event-start fc-event-end fc-event-future']")
    public WebElement newEventDisplay;

    @FindBy (xpath = "(//div[@class='event-popover__buttons']//button)[1]")
    public WebElement moreButton;

    @FindBy (xpath = "(//div[@style='display: inline-block;']//button[@aria-label='Actions'])[11]")
    public WebElement toggle;

    @FindBy (xpath = "(//span[@class='action-button__text'])[7]")
    public WebElement deleteButton;
}
