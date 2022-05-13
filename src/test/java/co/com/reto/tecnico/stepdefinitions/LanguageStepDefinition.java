package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.LoginModel;
import co.com.reto.tecnico.questions.Language;
import co.com.reto.tecnico.tasks.Change;
import co.com.reto.tecnico.tasks.SignIn;
import co.com.reto.tecnico.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LanguageStepDefinition {
    @Before
    public void onStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that user log in in the StartSharp page$")
    public void thatUserLogInInTheStartSharpPage(List<LoginModel> credential){
        theActorCalled("User").wasAbleTo(
                OpenUp.theStartSharpPage(),
                SignIn.withTheData(credential)
        );
    }

    @When("^he user change the language of the page$")
    public void heUserChangeTheLanguageOfThePage(){
        theActorCalled("User").attemptsTo(
                Change.theLanguage()
        );
    }

    @Then("^he can see the (.*)$")
    public void heCanSeeThePlataformInSpanish(String portuguese){
        theActorInTheSpotlight().should(seeThat(Language.toThe(portuguese)));
    }
}
