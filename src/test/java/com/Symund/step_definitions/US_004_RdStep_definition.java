package com.Symund.step_definitions;

import com.Symund.pages.US_004_RdPage;
import io.cucumber.java.en.When;

public class US_004_RdStep_definition {

    US_004_RdPage us_004_rdPage = new US_004_RdPage();

    @When("user navigates three dots menu and Add to favorites on the file named Readme.md")
    public void userNavigatesThreeDotsMenuAndAddToFavoritesOnTheFileNamedReadmeMd() {


        us_004_rdPage.threeDotsReadMe.click();

        us_004_rdPage.


    }
}
