package com.Symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalkPage extends BasePage{


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

    @FindBy(xpath = "//div[@class='participant-row__user-wrapper has-menu-icon']")
    public WebElement getParticipants;

    @FindBy(xpath = "//div[@class='avatar icon icon-contacts']")
    public WebElement conversationBtn;

   @FindBy(xpath = "//button[@aria-label='Settings for participant \"A\"']")
    public WebElement participantsList;

   @FindBy (xpath = "//button//span[@class='action-button__icon icon-delete']")
    public WebElement removeBtn;

   @FindBy (xpath = "(//div[@class='rich-text--wrapper'])[last()]")
    public WebElement informMessage;

   @FindBy (xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement typingMessage;

   @FindBy (xpath = "//button[@type='submit']")
    public WebElement sendMessageBtn;

   @FindBy(xpath = "(//div[@class='message__main'])[last()]")
    public WebElement alreadyTypedMessage;

   @FindBy (xpath = "//button[@aria-label='Settings for conversation \"Conversation\"']")
    public WebElement menuConversation;

   @FindBy (xpath = "(//span[@class='action-button__text'])[last()]")
    public WebElement deleteConversationBtn;

   @FindBy (xpath = "//button[@class='primary']")
    public WebElement yesBtn;





}
