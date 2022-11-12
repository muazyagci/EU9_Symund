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
    private WebElement selectAllCheckBox;

    public void checkSelectAllCheckBox(){
        selectAllCheckBox.click();
    }

 @FindBy (xpath = "//span[@class='innernametext']")
    public List<WebElement> allFiles;



 @FindBy(xpath = "//td/a/span/span[@class='innernametext']")
 public List<WebElement> orderByName;

 @FindBy(xpath = "//td[@class ='filesize']")
 public List<WebElement> orderBySize;

   @FindBy(xpath = "//tbody//tr[@data-type='dir']")
   private List<WebElement> folders;

   @FindBy(xpath = "//tbody//tr[@data-type='file']")
   private List<WebElement> files;

   public int getCountOfFolders(){
     return folders.size();
   }

   public int getCountOFiles(){
     return files.size();
   }

   @FindBy(xpath = "//a//span[contains(text(),'folders')]")
   private WebElement totalCountOfItems;

   public void verifyTotalCountsOfFolderFiles(){
      int expectedCountOfFolders = getCountOfFolders();
    System.out.println("expectedCountOfFolders = " + expectedCountOfFolders);
      int expectedCountOfFiles = getCountOFiles();
    System.out.println("expectedCountOfFiles = " + expectedCountOfFiles);
      //3 folders and 1 files
      //012345678901234567890
      String str = totalCountOfItems.getText();
      int actualCountOfFolders = Integer.parseInt(str.substring(0,str.indexOf(" f")));
    System.out.println("actualCountOfFolders = " + actualCountOfFolders);
      int actualCountOfFiles = Integer.parseInt( str.substring(str.indexOf("d ")+2, str.lastIndexOf(" f")));
    System.out.println("actualCountOfFiles = " + actualCountOfFiles);

      Assert.assertEquals(expectedCountOfFolders,actualCountOfFolders);
      Assert.assertEquals(expectedCountOfFiles,actualCountOfFiles);




   }

 public void check_fileNameOrder(){

  List<String> allFilesNames= BrowserUtils.getElementsText(orderByName);

  List<String> actualAllFilesNames = allFilesNames;
  NameIcon.click();
  System.out.println("Once clicked = " + actualAllFilesNames);

  List<String> expectedSortedNames = BrowserUtils.getElementsText(orderByName);
  Collections.sort(expectedSortedNames);

  Assert.assertTrue(actualAllFilesNames.get(0).equals(expectedSortedNames.get(0)));
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