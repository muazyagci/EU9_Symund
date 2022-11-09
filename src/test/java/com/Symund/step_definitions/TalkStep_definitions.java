package com.Symund.step_definitions;

import com.Symund.pages.TalkPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkStep_definitions {

    TalkPage talkPage = new TalkPage();

    @When("user clicks to Menu button")
    public void user_clicks_to_menu_button() {
       talkPage.menuBtn.click();

    }

    @When("clicks to + button")
    public void clicks_to_button() {
       talkPage.addBtn.click();
    }

    @When("clicks to input box and type {string}")
    public void clicks_to_input_box_and_type(String groupName) {

        talkPage.conversationBox.sendKeys(groupName);


    }

    @When("clicks to Add participants button")
    public void clicks_to_add_participants_button() {
        talkPage.addParticipantsBtn.click();
    }

    @When("choose one participant and clicks create conversation button")
    public void choose_participant_and_clicks_create_conversation_button() {

        talkPage.participants.click();
        talkPage.createConversationBtn.click();

    }



    @Then("user can see created conversation {string}")
    public void userCanSeeCreatedConversation(String message) {

        String actualMessage = talkPage.message.getText();
        String expectedMessage = message;

        Assert.assertEquals(expectedMessage,actualMessage);


    }
}
