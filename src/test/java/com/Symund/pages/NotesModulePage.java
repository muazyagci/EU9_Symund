package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesModulePage extends BasePage{


    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNoteButton;

    @FindBy(xpath = "//div[@id='note-container']")
    public WebElement writeNote;

    @FindBy(xpath = "//span[contains(text(),'Hello World')]")
    public WebElement titleOfTheNote;

    @FindBy(xpath = "//div[@class='app-navigation']//li[12]//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDotButton;

    @FindBy(xpath = "//button[@class='action-button focusable']")
    public WebElement favoritesButton;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement filesButton;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favButton2;
    //div[@id='app-content-favorites']//tbody[@id='fileList']//tr[1]

    @FindBy(xpath = "//span[contains(text(),'Hello World')]")
    public WebElement fileList;











}
