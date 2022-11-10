package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']")
    public WebElement dashboardBtn;

    @FindBy (xpath = "//div[@id='expand']")
    public WebElement profilePictureBtn;

    @FindBy (linkText = "Log out")
    public WebElement logOutBtn;

    public static void navigateToModule(String moduleName){
        WebElement moduleIcon=Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[@data-id='"+moduleName+"']"));
        moduleIcon.click();
    }

}
