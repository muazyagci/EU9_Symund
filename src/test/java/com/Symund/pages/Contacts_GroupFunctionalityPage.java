package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Contacts_GroupFunctionalityPage {

    public Contacts_GroupFunctionalityPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }






    public void navigateToModule(String moduleName){
      Driver.getDriver().findElement(By.xpath("//ul/li[@data-id=\""+moduleName+"\"]")).click();
    }

    public void navigateToContact(String contactName){
       WebElement contName = Driver.getDriver().findElement(By.xpath("//div[contains(text(),"+contactName+")]/ancestor::div[2]"));
       Actions actions = new Actions(Driver.getDriver());
       actions.moveToElement(contName).doubleClick().perform();




    }


    @FindBy(xpath = "//*[@id=\"user\"]")
    public WebElement userName;


    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy (xpath = "//*[contains(text(),'All contacts')]")
    public WebElement Allcontacts;


    @FindBy(xpath = "//*[@id=\"newgroup\"]/div/div/div/div/button")
    public WebElement addGroupButton;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement groupNameInput;

    @FindBy(xpath = "//*[@id=\"submit-form\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement Groups;

    @FindBy(xpath = "//div[@class='app-navigation-entry__counter']")
    public WebElement contactCounter;

@FindBy(xpath = "//input[@placeholder=\"Choose property type\"]")
    public WebElement propertyDropdown;

@FindBy(xpath = "//*[contains(text(),'Birthday')]/ancestor::li[1]")
    public WebElement birthdayProperty;













}
