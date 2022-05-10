package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.questions.Answer;
import co.com.reto.tecnico.tasks.Business;
import co.com.reto.tecnico.tasks.Meeting;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CreateMeetingStepDefinition {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^he create the new meeting$")
    public void heCreateTheNewMeeting(List<MeetingModel> meetingModelList) throws Exception {
        OnStage.theActorCalled("Admin").attemptsTo(
                //Business.createBusinessUnit(meetingModelList));
                Meeting.createMeetingAssociateBusiness(meetingModelList));
    }

    @Then("^new meeting is created and validate$")
    public void newMeetingIsCreatedAndValidate(List<MeetingModel> meetingModelList) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(meetingModelList)));
    }

}
