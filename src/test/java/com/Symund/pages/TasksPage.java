package com.Symund.pages;

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



    @FindBy(xpath = "//ul[@class='app-navigation__list']/div/li/a//span[@title='School']")
    public WebElement listOftasks;

    @FindBy(id = "target")
    public WebElement addATaskInputBox;

    @FindBy(xpath = "//span[normalize-space()='task1']")
    public WebElement CreatedTask;

    @FindBy(xpath = "//label[@for='toggleCompleted_5afc8beb-462c-442c-8406-d0ba83fc91c5']")
    public WebElement completedCheckBoxBtn;

    @FindBy(xpath = "(//a[@class='app-navigation-entry-link'])[6]")
    public WebElement completedModule;
}
