package com.Symund.step_definitions;

import com.Symund.pages.TalkPage;
import com.Symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkStep_definitions {

    TalkPage talkPage = new TalkPage();



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

    @When("user clicks to conversation button")
    public void user_clicks_to_message_button() {

        talkPage.conversationBtn.click();

    }


    @Then("user can see the participants of the conversation {string}")
    public void userCanSeeTheParticipantsOfTheConversation(String getParticipants) {

        String actualParticipants = talkPage.getParticipants.getText();
        String expectedParticipants = getParticipants;

        Assert.assertEquals(expectedParticipants,actualParticipants);

    }

    @When("user clicks to three dots button near the name of participant")
    public void user_clicks_to_three_dots_button_near_the_name_of_participant() {
        talkPage.participantsList.click();
    }
    @When("clicks Remove participant button")
    public void clicks_remove_participant_button() {
        talkPage.removeBtn.click();
        BrowserUtils.sleep(10);
    }
    @Then("user can see {string}")
    public void user_can_see(String informMessage) {


        String actualInformMessage = talkPage.informMessage.getText();
        String expectedInformMessage = informMessage;

        Assert.assertTrue(actualInformMessage.contains(expectedInformMessage));

    }


    @Then("user types {string} inside input box and press Send button and user can see sent message")
    public void user_types_inside_input_box_and_press_send_button(String typingMessage) {
talkPage.typingMessage.sendKeys(typingMessage);
talkPage.sendMessageBtn.click();

        String actualTypedMessage = talkPage.alreadyTypedMessage.getText();
        String expectedTypedMessage = typingMessage;

        Assert.assertEquals(expectedTypedMessage,actualTypedMessage);


    }

    @When("user clicks to three dots button near the created conversation")
    public void user_clicks_to_three_dots_button_near_the_created_conversation() {
        talkPage.menuConversation.click();


    }
    @Then("user clicks to delete conversation button and clicks Yes button")
    public void user_clicks_to_delete_conversation_button_and_clicks_yes_button() {

        talkPage.deleteConversationBtn.click();
        talkPage.yesBtn.click();


    }



    }






