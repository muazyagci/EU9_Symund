package com.Symund.pages;

import com.Symund.utilities.BrowserUtils;
import com.Symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage extends BasePage {

    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(id = "contact-org")
    public WebElement companyBtn;

    @FindBy(id = "contact-title")
    public WebElement titleBtn;

    @FindBy(id = "contact-fullname")
    public WebElement contactFullname;


    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    private WebElement contactTotalNumber;



    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    private List<WebElement> contacts;


    public int getSizeOfContacts() {
        return contacts.size();
    }


    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    private WebElement actualSizeOfContacts;


    public int getActualSizeOfContacts() {
       String str = actualSizeOfContacts.getText().trim();
       int totalCount = Integer.parseInt(str);
       return totalCount;
    }



    public void navigateToContact(){

        contacts.get(contacts.size()-1).click();
    }

    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    private WebElement chooseFromFiles;


    public void clickOnChooseFromFiles(){

        ButtonIcon.click();
        chooseFromFiles.click();

    }
    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    private WebElement ButtonIcon;

    @FindBy(xpath = "//span[@class='filename-parts__first']")
    private List<WebElement> fileName;




    @FindBy(xpath = "//button[.='Choose']")
    private WebElement chooseBtn;


    public void chooseAnAvatar(){
        fileName.get(3).click();
        chooseBtn.click();
    }

    @FindBy(xpath="//div[@class='contact-header__actions']")
    private WebElement menuButton;

    @FindBy(xpath ="//div[@class='popover__inner']//span[@class='action-button__icon icon-delete']")
    private WebElement deleteButton;




    public void verifyContactIsDeleted(){

       Assert.assertTrue(contacts.get(contacts.size()-1).isDisplayed());
        contacts.get(contacts.size()-1).click();

       // BrowserUtils.sleep(3);
       // actions.moveToElement(menuButton).perform();
       // BrowserUtils.clickWithTimeOut(menuButton,3);
        menuButton.click();



       //BrowserUtils.sleep(5);
       deleteButton.click();


    }

















}
