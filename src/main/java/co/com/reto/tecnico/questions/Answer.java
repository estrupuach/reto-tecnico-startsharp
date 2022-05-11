package co.com.reto.tecnico.questions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.SearchMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private String nameMeeting;

    public Answer(String nameMeeting) {
        this.nameMeeting = nameMeeting;
    }

    public static Answer toThe(List<MeetingModel> meetingModelList){
        return new Answer(meetingModelList.get(0).getNameMeeting());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        //actor.attemptsTo(Click.on());

        String nameQueryMeeting = Text.of(SearchMeetingPage.NAME_MEETING).viewedBy(actor).asString();
        //System.out.println("valor enviado desde datadrive: "+nameMeeting);
        //System.out.println("valor tomado desde page: "+nameQueryMeeting);

        if(nameMeeting.equals(nameQueryMeeting)){
            return true;
        }else {
            return false;
        }
    }
}
