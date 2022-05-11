package co.com.reto.tecnico.stepdefinitions;

import co.com.reto.tecnico.model.LoginModel;
import co.com.reto.tecnico.questions.AnswerLanguage;
import co.com.reto.tecnico.tasks.Language;
import co.com.reto.tecnico.tasks.Login;
import co.com.reto.tecnico.tasks.StartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.List;

public class stepDefinitionLanguage {
    @Before
    public void onStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user log in in the StartSharp page$")
    public void thatUserLogInInTheStartSharpPage(List<LoginModel> loginModelList) throws Exception {
        OnStage.theActorCalled("User").wasAbleTo(
                StartPage.openUpStartSharpPage(),
                Login.StartSharpPage(loginModelList)
        );
    }

    @When("^he user change the language of the page$")
    public void heUserChangeTheLanguageOfThePage() throws Exception {
        OnStage.theActorCalled("User").attemptsTo(
                Language.changeLanguage()
        );
    }

    @Then("^he can see the (.*)$")
    public void heCanSeeThePlataformInSpanish(String questions) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLanguage.toThe(questions)));
    }
}
