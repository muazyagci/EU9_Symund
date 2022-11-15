package com.Symund.step_definitions;

import com.Symund.pages.ContactsPage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class ContactsStep_definition {

    ContactsPage contactsPage = new ContactsPage();


    @Then("user can create a new contact Name {string} Surname {string}")
    public void user_can_create_a_new_contact_name_surname(String name, String surname) {
        contactsPage.newContactBtn.click();
        contactsPage.companyBtn.sendKeys(name+ Keys.ENTER);
        BrowserUtils.waitFor(5);
        contactsPage.titleBtn.sendKeys(surname+ Keys.ENTER);
        BrowserUtils.waitFor(2);


    }



    @Then("user can see the number of all {string} and the list of all contacts")
    public void user_can_see_the_number_of_all_and_the_list_of_all_contacts(String newContact) {
        BrowserUtils.waitFor(3);
        contactsPage.getContactsName(newContact);

        BrowserUtils.waitFor(3);



    }

    @Then("user clicks on {string}")
    public void user_clicks_on(String Name) {

        BrowserUtils.waitFor(5);
        contactsPage.clickOnContact(Name);
    }
    @Then("user is able to change the profile and upload a picture")
    public void user_is_able_to_change_the_profile_and_upload_a_picture() {

    }


    @Then("user can see the number of all contacts and the list of all contacts")
    public void user_can_see_the_number_of_all_contacts_and_the_list_of_all_contacts() {

        Assert.assertEquals(contactsPage.getSizeOfContacts(),contactsPage.getActualSizeOfContacts());
    }





}