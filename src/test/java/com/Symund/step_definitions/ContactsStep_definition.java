package com.Symund.step_definitions;

import com.Symund.pages.ContactsPage;
import io.cucumber.java.en.Then;

public class ContactsStep_definition {

    ContactsPage contactsPage = new ContactsPage();


    @Then("user can create a new contact Name {string} Surname {string}")
    public void user_can_create_a_new_contact_name_surname(String name, String surname) {
        contactsPage.newContactBtn.click();
        contactsPage.companyBtn.sendKeys(name);
        contactsPage.titleBtn.sendKeys(surname);
        contactsPage.assertMethod("Jack");
    }
}