package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_004_RdPage extends BasePage {

    @FindBy (xpath = "(//a[@class= 'action action-menu permanent'])[4]")
    public WebElement threeDotsReadMe;



}
