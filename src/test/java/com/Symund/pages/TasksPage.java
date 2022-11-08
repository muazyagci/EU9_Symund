package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {


    @FindBy (xpath = "//div[@id='content-vue']//li[7]//a[1]")
    public WebElement addListBtn;

    @FindBy (xpath = "//input[@id='newListInput']")
    public WebElement addListInputBox;

    @FindBy (xpath = "//li[@class='app-navigation-entry collection reactive edit']//input[@title='Save']")
    public WebElement saveListNameBtn;

    @FindBy (xpath = "//div[xpath='1']")
    public WebElement listVerification;

    public void listNames(String listname){
       WebElement listOfLists= Driver.getDriver().findElement(By.xpath("//ul[@class='app-navigation__list']/div/li/a//span[@title='"+listname+"']"));
        Assert.assertTrue(listOfLists.isDisplayed());
    }
}
