package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalkPage extends BasePage{



    @FindBy(xpath="//a[@class='app-navigation-toggle']")
    public WebElement menuBtn;

    @FindBy(xpath ="//button[@class='toggle has-tooltip']")
    public WebElement addBtn;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationBox;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsBtn;

    @FindBy(xpath = "//div[@class='participant-row__user-descriptor']")
    public WebElement participants;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationBtn;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public WebElement message;






}
