package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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


    //@FindBy (xpath ="//div//div[contains(text(),'Kral')]")
    //public WebElement Kral;

    public static void getContactsName(String name) {

        WebElement actual = Driver.getDriver().findElement(By.xpath("//div//div[contains(text(),'" + name + "')"));

        if (name.equals("Jack")) {
            Assert.assertEquals(name, Driver.getDriver().findElement(By.xpath("//div//div[contains(text(),'Jack')]")).getText());
        } else {
            Assert.assertEquals(name, Driver.getDriver().findElement(By.xpath("//div//div[contains(text(),'Kral')]")).getText());
        }
    }


    public WebElement getContactName(String contactName) {
        //String xpath = "//*[contains(text(), '"+contactName+"')]";
        //return Driver.getDriver().findElement(By.xpath(xpath));

        String xpath = "//div//div[contains(text(),'" + contactName + "')]";

        String fghgh = Driver.getDriver().findElement(By.xpath(xpath)).getText();
        System.out.println(fghgh);
        return Driver.getDriver().findElement(By.xpath(fghgh));


    }

    public void clickOnContact(String contactName) {


        //String xpath = "//div//div[contains(text(),'"+contactName+"')]";
        WebElement name = Driver.getDriver().findElement(By.xpath("//div//div[contains(text(),'" + contactName + "')]"));
        name.click();


    }

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    private WebElement contactTotalNumber;


}
