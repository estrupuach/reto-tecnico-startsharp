package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.userinterface.StartSharpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private StartSharpPage startSharpPage;

    public static OpenUp theStartSharpPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(startSharpPage));

    }
}
