package com.Symund.pages;

import com.Symund.utilities.ConfigurationReader;
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

    String listname= ConfigurationReader.getProperty("listName");

    @FindBy(xpath = "//ul[@class='app-navigation__list']/div/li/a//span[@title='School']")
    public WebElement listOftasks;

    @FindBy(id = "target")
    public WebElement addATaskInputBox;
}
