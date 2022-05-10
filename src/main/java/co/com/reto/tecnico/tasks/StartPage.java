package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.userinterface.StartSharpPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;

public class StartPage implements Task {

    private StartSharpPage startSharpPage;

    public static StartPage openUpStartSharpPage() {
        return Tasks.instrumented(StartPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(startSharpPage));

    }
}
