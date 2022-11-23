package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesModulePage extends BasePage{


    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNoteButton;

    @FindBy(xpath = "/html/body/div[3]/main/div/div")
    public WebElement writeNote;

//div[@id='note-container']
    @FindBy(xpath = "//span[contains(text(),'Hello World')]")
    public WebElement titleOfTheNoteDisplay;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[3]/div/div/div/div/button")
    public WebElement threeDotButton;

    @FindBy(xpath = "//button[@class='action-button focusable']")
    public WebElement favoritesButton;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement filesButton;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favButton2;
    //div[@id='app-content-favorites']//tbody[@id='fileList']//tr[1]

    @FindBy(xpath = "(//span[.='Notes'])[3]")
    public WebElement notes;

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

    @FindBy(xpath = "(//(//ul[@class='app-navigation-entry__children'])[1]//span[contains(text(),'Personal')]")
    public WebElement personalContains;

    //span[@title='Personal']
    //(//span[contains(text(),'Personal')])[1]
    //(//ul[@class='app-navigation-entry__children'])[1]//span[contains(text(),'Personal')]



    //ul[@class='app-navigation-entry__children']
    @FindBy(xpath = "(//div[@class='app-navigation']//li[2]//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[2]")
    public WebElement favThreeDotButton;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[3]")
    public WebElement deleteNote;

    @FindBy(xpath = "//span[@title='Hello World!']")
    public WebElement isDeleted;












}
