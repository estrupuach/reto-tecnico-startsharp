package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.questions.Meeting;
import co.com.reto.tecnico.tasks.Create;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreateMeetingStepDefinition {

    @Before
    public void setStage()
    {
        setTheStage(new OnlineCast());
    }


    @When("^he create the new meeting$")
    public void heCreateTheNewMeeting(List<MeetingModel> data){
        theActorCalled("Admin").attemptsTo(
                Create.theMeetingWithTheData(data));
    }

    @Then("^new meeting is created and validate$")
    public void newMeetingIsCreatedAndValidate(List<MeetingModel> name){
        theActorInTheSpotlight().should(seeThat(Meeting.withYour(name)));
    }

}
