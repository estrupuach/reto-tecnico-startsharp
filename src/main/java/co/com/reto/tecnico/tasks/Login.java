package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.model.LoginModel;
import co.com.reto.tecnico.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private List<LoginModel> loginModelList;

    public Login(List<LoginModel> loginModelList) {
        this.loginModelList = loginModelList;
    }

    public static Login StartSharpPage(List<LoginModel> loginModelList) {
        return Tasks.instrumented(Login.class, loginModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginModelList.get(0).getStrUsername()).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(loginModelList.get(0).getStrPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.ENTER_BUTTON)
        );

    }
}
