package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class Create implements Task {
    private List<MeetingModel> meetingModelList;

    public Create(List<MeetingModel> meetingModelList) {
        this.meetingModelList = meetingModelList;
    }

    public static Create theMeetingWithTheData(List<MeetingModel> meetingModelList) {
        return Tasks.instrumented(Create.class, meetingModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.LIST_MEETING),
                Click.on(MeetingPage.OPTION_MEETING),
                Click.on(MeetingPage.BUTTON_CREATE_MEETING),
                Enter.theValue(meetingModelList.get(0).getNameMeeting()).into(MeetingPage.INPUT_NAME),
                Click.on(MeetingPage.LIST_TYPE),
                Enter.theValue(meetingModelList.get(0).getType()).into(MeetingPage.INPUT_TYPE),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_TYPE),
                Enter.theValue(meetingModelList.get(0).getNumberMeeting()).into(MeetingPage.INPUT_NUMBER),
                Enter.theValue(meetingModelList.get(0).getFechaInicio()).into(MeetingPage.INPUT_DATE_START),
                SelectFromOptions.byValue(meetingModelList.get(0).getHourStart()).from(MeetingPage.SELECT_HOUR_START),
                Enter.theValue(meetingModelList.get(0).getEndDate()).into(MeetingPage.INPUT_END_DATE),
                SelectFromOptions.byValue(meetingModelList.get(0).getEndHour()).from(MeetingPage.SELECT_END_HOUR),

                Click.on(MeetingPage.LIST_LOCATION),
                Enter.theValue(meetingModelList.get(0).getLocation()).into(MeetingPage.INPUT_LOCATION),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_LOCATION),

                Click.on(MeetingPage.LIST_UNIT),
                Enter.theValue(meetingModelList.get(0).getStrNameBusiness()).into(MeetingPage.INPUT_UNIT),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_UNIT),

                Click.on(MeetingPage.LIST_ORGANIZED_BY),
                Enter.theValue(meetingModelList.get(0).getOrganizedBy()).into(MeetingPage.INPUT_ORGANIZEDBY),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_ORGANIZEDBY),

                Click.on(MeetingPage.LIST_REPORTER),
                Enter.theValue(meetingModelList.get(0).getReporter()).into(MeetingPage.INPUT_REPORTER),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_REPORTER),

                Click.on(MeetingPage.LIST_ATTENDEE),
                Enter.theValue(meetingModelList.get(0).getAttendee()).into(MeetingPage.INPUT_ATTENDEE),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_ATTENDEE),

                Click.on(MeetingPage.BUTTON_SAVE)
        );
    }
}
