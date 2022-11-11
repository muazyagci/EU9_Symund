package com.Symund.pages;

import com.Symund.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderViewPage extends BasePage{

   @FindBy( id="headerName-container")
    public WebElement NameIcon;

   @FindBy( id="headerSize")
    public WebElement sizeIcon;

    @FindBy( id="headerDate")
    public WebElement ModifiedIcon;

    @FindBy( id="view-toggle")
    public WebElement ToggleIcon;

    //@FindBy(id="headerSelection" )
    //public WebElement SelectAllIcon;

    @FindBy (xpath = "//label[@for='select_all_files']")
    public WebElement SelectAllIcon;

    @FindBy (xpath = "//span[@class='innernametext']")
    public List<WebElement> allFiles;

 @FindBy(xpath = "//td/a/span/span[@class='innernametext']")
 public List<WebElement> orderByName;

 @FindBy(xpath = "//td[@class ='filesize']")
 public List<WebElement> orderBySize;



 public void check_fileNameOrder(){

  List<String> allFilesNames= BrowserUtils.getElementsText(orderByName);

  List<String> actualAllFilesNames = allFilesNames;
  NameIcon.click();
  System.out.println("Once clicked = " + actualAllFilesNames);

  List<String> expectedSortedNames = BrowserUtils.getElementsText(orderByName);
  Collections.sort(expectedSortedNames);

  Assert.assertFalse(actualAllFilesNames.get(0).equals(expectedSortedNames.get(0)));
  System.out.println("Before Clicking Name Icon = " + actualAllFilesNames);
  System.out.println("After clicking Name Icon its ordered in alphabetical order= " + expectedSortedNames);

 }

 public void check_SizeNameOrder() {
  List<String> sizeOfall= BrowserUtils.getElementsText(orderBySize);

  List<String> actualAllSize = sizeOfall;
  sizeIcon.click();
  System.out.println("Once clicked = " + actualAllSize);

  List<String> expectedSortedSize = BrowserUtils.getElementsText(orderBySize);
  System.out.println("After clicked= " + expectedSortedSize);

  Assert.assertFalse(actualAllSize.equals(expectedSortedSize));
  System.out.println("Before Clicking Size Icon= " + actualAllSize);
  System.out.println("After clicking Size Icon its ordered by Ascending order = " + expectedSortedSize);

 }


}