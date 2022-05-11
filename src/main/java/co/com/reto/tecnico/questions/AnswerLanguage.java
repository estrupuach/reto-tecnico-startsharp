package co.com.reto.tecnico.questions;

import co.com.reto.tecnico.userinterface.LanguagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerLanguage implements Question<Boolean> {
    private String question;

    public AnswerLanguage(String question) {
        this.question = question;
    }

    public static AnswerLanguage toThe(String questions) {
        return new AnswerLanguage(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String validateQuestions = Text.of(LanguagePage.ITEM_PANEL).viewedBy(actor).asString();
        if(question.equals(validateQuestions))
            return true;
        else
            return false;
    }
}
