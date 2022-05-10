package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.LoginModel;
import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.questions.Answer;
import co.com.reto.tecnico.questions.AnswerBusinnesUnit;
import co.com.reto.tecnico.tasks.Business;
import co.com.reto.tecnico.tasks.Login;
import co.com.reto.tecnico.tasks.Meeting;
import co.com.reto.tecnico.tasks.StartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StartSharpStepDefinitions {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Admin log in in the StartSharp page$")
    public void thatAdminLogInInTheStartSharpPage(List<LoginModel> loginModelList) throws Exception {
        OnStage.theActorCalled("Admin").wasAbleTo(
                StartPage.openUpStartSharpPage(),
                Login.StartSharpPage(loginModelList)
        );
    }

    @When("^he create the business unit$")
    public void heCreateTheBusinessUnit(List<MeetingModel> meetingModelList) {
        OnStage.theActorCalled("Admin").attemptsTo(
                Business.createBusinessUnit(meetingModelList)
        );
    }

    @Then("^new meeting is created$")
    public void newMeetingIsCreated(List<MeetingModel> meetingModelList) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerBusinnesUnit.toThe(meetingModelList)));
    }


    /*@When("^he create the business unit and asociate with new meeting$")
    public void heCreateTheBusinessUnitAndAsociateWithNewMeeting(List<MeetingModel> meetingModelList) throws Exception {
        OnStage.theActorCalled("Admin").attemptsTo(
                Business.createBusinessUnit(meetingModelList)
        );
    }*/
}
