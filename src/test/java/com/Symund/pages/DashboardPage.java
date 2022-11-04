package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']")
    public WebElement dashboardBtn;

    @FindBy (xpath = "//div[@id='expand']")
    public WebElement profilePictureBtn;

    @FindBy (linkText = "Log out")
    public WebElement logOutBtn;
}
