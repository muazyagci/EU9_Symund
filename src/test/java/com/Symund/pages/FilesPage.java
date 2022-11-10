package com.Symund.pages;

import com.Symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[1]")
    public WebElement AllFiles;

    public WebElement navigateToFolders(String folderName)
    {
        WebElement folder= Driver.getDriver().
                findElement(By.xpath("//*[@data-file=\""+folderName+"\"]"));


        return folder;
    }

@FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[6]/a/span[2]")
    public WebElement deleteButton;


    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[7]/a")
    public WebElement deletedFiles;

    public WebElement navigateToDeletedFolder(String folderName){

        WebElement deletedFolder=Driver.getDriver().
                findElement(By.xpath("//tr[@data-path=\""+folderName+"\"]"));
        return deletedOrder;

    }
@FindBy(xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[3]/a")
    public WebElement deletedOrder;


    public WebElement selectDeletedFolder(String folderName){

      WebElement folder=  Driver.getDriver().findElement(By.xpath(
              "//tr[@data-path=\""+folderName+"\"]/td"
      ));

      return folder;

    }

    public WebElement deletedFileQueue(int deletionNumber){

        WebElement deletedFile =Driver.getDriver().findElement
                (By.xpath("/html/body/div[3]/div[2]/div[13]/table/tbody/tr["+deletionNumber+"]"));

        return deletedFile;
    }

    @FindBy (xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[2]/div/a")
    public WebElement OrderByNameButton;


    @FindBy (xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[2]/div/span")
    public WebElement threeDots;

    @FindBy (xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[2]/div/span/div/ul/li[2]/a")
    public WebElement deletePermanent;

    @FindBy (xpath = "/html/body/div[3]/div[2]/div[13]/table/tfoot/tr/td[2]/span/span[1]")
    public WebElement deletedFolderSize;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[2]/div/span/div/ul/li[1]/a")
public WebElement restoreButton;

}


