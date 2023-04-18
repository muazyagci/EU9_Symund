package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesModulePage extends BasePage{


    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNoteButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[1]")
    public WebElement renameButton;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement noteInput;

    @FindBy(xpath = "/html/body/div[3]/main/div/div")
    public WebElement writeNote;

    @FindBy(xpath = "//span[@title='Hello World!']")
    public WebElement titleOfTheNoteDisplay;

    @FindBy(xpath = "(//button[@aria-label])[3]")
    public WebElement threeDotButton;

    @FindBy(xpath = "//span[contains(text(),'Add to favorites')]")
    public WebElement favoritesButton;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement filesButton;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]/button")
    public WebElement favButton2;

    @FindBy(xpath = "//span[contains(text(),'Hello World')]")
    public WebElement fileList;

    @FindBy(xpath = "//span[@class='action-buttons']")
    public WebElement dropDownButton;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailButton;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement lettersAndWords;

    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryInput;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[1]")
    public WebElement categoryButton;

    @FindBy(xpath = "//span[@title='Personal']")
    public WebElement personalContains;

    @FindBy(xpath = "(//div[@class='app-navigation']//li[2]//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[2]")
    public WebElement favThreeDotButton;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[3]")
    public WebElement deleteNote;

    @FindBy(xpath = "//span[@title='Hello World!']")
    public WebElement isDeleted;












}
