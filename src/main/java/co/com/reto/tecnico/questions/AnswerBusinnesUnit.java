package co.com.reto.tecnico.questions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.SearchBusinessUnitPage;
import co.com.reto.tecnico.userinterface.SearchMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
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
        String nameQueryBusiness = Text.of(SearchBusinessUnitPage.NAME_BUSINESS_UNIT).viewedBy(actor).asString();
        //System.out.println("valor enviado desde datadrive: "+nameBusinessUnit);
        //System.out.println("valor tomado desde page: "+nameQueryBusiness);
        if(nameBusinessUnit.equals(nameQueryBusiness)){
            return true;
        }else {
            return false;
        }
    }
}
