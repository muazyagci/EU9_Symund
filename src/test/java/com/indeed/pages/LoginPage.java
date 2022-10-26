package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "user")
    public WebElement emailInputBox;

    @FindBy (id = "password")
    public WebElement passwordInputBox;

    @FindBy (id = "submit-form")
    public WebElement enterKey;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMSG;

}
