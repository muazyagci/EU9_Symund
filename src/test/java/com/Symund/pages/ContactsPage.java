package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(id = "contact-org")
    public WebElement companyBtn;

    @FindBy (id = "contact-title")
    public WebElement titleBtn;

    @FindBy (xpath = "//*[@id=\"YjBmZWE3YjAtMTJmMC00YzY0LTkyMDQtOTlhMzg2MWY3NGEwfmNvbnRhY3\"]/div[2]")
    public WebElement fullNameIsDisplayed;




    public void assertMethod(String fullName){


        Assert.assertEquals(fullName, fullNameIsDisplayed.getText());
        System.out.println(fullNameIsDisplayed.getText());

        //Assert.assertEquals(fullName, companyBtn.getAttribute("type"));
        //System.out.println("companyBtn.getAttribute(\"type\") = " + companyBtn.getAttribute("type"));
        //System.out.println("fullNameIsDisplayed.getText().equals(fullName) = " + fullNameIsDisplayed.getText().equals(fullName));

    }





}
