package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.userinterface.LanguagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Language implements Task {
    public static Language changeLanguage(){
        return Tasks.instrumented(Language.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(LanguagePage.LIST_LANGUAGE),
            Click.on(LanguagePage.LANGUAGE_PORTUGUESE)
        );
    }
}
