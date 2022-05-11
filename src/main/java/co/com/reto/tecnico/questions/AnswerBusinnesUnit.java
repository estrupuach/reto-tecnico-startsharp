package co.com.reto.tecnico.questions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.SearchBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerBusinnesUnit implements Question<Boolean>{
    private String nameBusinessUnit;

    public AnswerBusinnesUnit(String nameBusinessUnit) {
        this.nameBusinessUnit = nameBusinessUnit;
    }

    public static AnswerBusinnesUnit toThe(List<MeetingModel> meetingModelList){
        return new AnswerBusinnesUnit(meetingModelList.get(0).getStrNameBusiness());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Enter.theValue(nameBusinessUnit)
                .into(SearchBusinessUnitPage.INPUT_NAME_BUSINESS_UNIT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String nameQueryBusiness = Text.of(SearchBusinessUnitPage.NAME_BUSINESS_UNIT).viewedBy(actor).asString();
        if(nameBusinessUnit.equals(nameQueryBusiness)){
            return true;
        }else {
            return false;
        }
    }
}
