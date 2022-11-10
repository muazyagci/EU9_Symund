package com.Symund.pages;

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

 public void check_fileNameOrder(){

  //List all folder first name
  List<String> firstLetter = new ArrayList<>();

  for (int i = 0; i < orderByName.size(); i++) {
   if (orderByName.get(i).getText().length() != 0) {
    firstLetter.add(orderByName.get(i).getText().substring(0, 1));
   }
  }
  System.out.println("firstLetter = " + firstLetter);
  // System.out.println("firstLetter1 = "+firstLetter.get(0));
  // String s1 = firstLetter.get(0);

  //Ascending order
  List<String> sortedfirstletter = firstLetter;
  Collections.sort(sortedfirstletter);
  //System.out.println("sortedfirstletterAll = " + sortedfirstletter);

  System.out.println("sortedFirstLetter = " + sortedfirstletter.get(0));
  // String s2 = sortedfirstletter.get(0);
  Assert.assertEquals("Verify the same letter",firstLetter.get(0),sortedfirstletter.get(0));
  // Assert.assertEquals("let's verify",s1,s2);
 }



}