package com.Symund.pages;

import com.Symund.utilities.BrowserUtils;
import org.apache.commons.collections.iterators.ArrayListIterator;
import org.apache.commons.lang3.ArraySorter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FolderViewPage extends BasePage{

   @FindBy( id="headerName-container")
    public WebElement NameIcon;

   @FindBy( id="headerSize")
    public WebElement sizeIcon;

    @FindBy( id="headerDate")
    public WebElement ModifiedIcon;

    @FindBy( id="view-toggle")
    public WebElement ToggleIcon;

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
   ////td/span[@class='modified live-relative-timestamp'] Modified

   @FindBy(xpath = "//td//span[contains(text(),'ago')]")
   public List<WebElement> orderbyModified;



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
   }

 public void check_fileNameOrder(){

     List<String> actualAllFilesNames= BrowserUtils.getElementsText(orderByName);
     System.out.println("actualAllFilesNames = " + actualAllFilesNames);

     List<String> expectedSortedNames = BrowserUtils.getElementsText(orderByName);
     System.out.println("expectedSortedNames = " + expectedSortedNames);
     Collections.sort(expectedSortedNames);

     Assert.assertTrue(expectedSortedNames.equals(actualAllFilesNames));
     System.out.println("ExpectedSortedNames = " + expectedSortedNames);
     System.out.println("Verification of Sorted Alphabetically After click = " + actualAllFilesNames);
 }


 public void check_SizeNameOrder() {

     List<String> beforeClick = BrowserUtils.getElementsText(orderBySize);
     System.out.println("beforeClick = " + beforeClick);
     sizeIcon.click();
     List<String> afterClick = BrowserUtils.getElementsText(orderBySize);
     System.out.println("afterClick = " + afterClick);
     Assert.assertNotEquals(beforeClick,afterClick);
 }
 public void check_ModifiedOrder(){

     List<String> allModified = BrowserUtils.getElementsText(orderbyModified);

     List<String> actualAllModified = allModified;
     System.out.println("actualAllModified = " + actualAllModified);

     List<String> expectedAfterModified = BrowserUtils.getElementsText(orderbyModified);
     Collections.sort(expectedAfterModified);
     System.out.println("expectedAfterModified = " + expectedAfterModified);

     Assert.assertTrue(actualAllModified.equals(expectedAfterModified));
     System.out.println("Actual= " + actualAllModified);
     System.out.println("Expected= " + expectedAfterModified);
 }

    public void check_ToggleView(){
       ToggleIcon.isEnabled();
    }


}
