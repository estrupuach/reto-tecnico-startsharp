package co.com.reto.tecnico.questions;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.SearchMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Meeting implements Question<Boolean> {
    private String nameMeeting;

    public Meeting(String nameMeeting) {
        this.nameMeeting = nameMeeting;
    }

    public static Meeting withYour(List<MeetingModel> meetingModelList){
        return new Meeting(meetingModelList.get(0).getNameMeeting());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Enter.theValue(nameMeeting).into(SearchMeetingPage.INPUT_NAME_MEETING));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String nameQueryMeeting = Text.of(SearchMeetingPage.NAME_MEETING).viewedBy(actor).asString();

        if(nameMeeting.equals(nameQueryMeeting)){
            return true;
        }else {
            return false;
        }
    }
}
