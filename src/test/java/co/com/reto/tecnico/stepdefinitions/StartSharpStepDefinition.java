package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.LoginModel;
import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.questions.AnswerBusinnesUnit;
import co.com.reto.tecnico.tasks.CreateBU;
import co.com.reto.tecnico.tasks.SignIn;
import co.com.reto.tecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StartSharpStepDefinition {
    @Before
    public void setStage()
    {
        setTheStage(new OnlineCast());
    }
    @Given("^that Admin log in in the StartSharp page$")
    public void thatAdminLogInInTheStartSharpPage(List<LoginModel> loginModelList){
        theActorCalled("Admin").wasAbleTo(
                OpenUp.theStartSharpPage(),
                SignIn.withTheData(loginModelList)
        );
    }

    @When("^he create the business unit$")
    public void heCreateTheBusinessUnit(List<MeetingModel> data) {
        theActorCalled("Admin").attemptsTo(
                CreateBU.theBusinessUnitWithThe(data)
        );
    }

    @Then("^new meeting is created$")
    public void newMeetingIsCreated(List<MeetingModel> meetingModelList){
        theActorInTheSpotlight().should(seeThat(AnswerBusinnesUnit.toThe(meetingModelList)));
    }
}
