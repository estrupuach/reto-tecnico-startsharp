package co.com.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage extends PageObject {
    public static final Target LIST_MEETING = Target.the("deployment the diferents options").
            located(By.cssSelector("a[href='#nav_menu1_3_2']"));
    public static final Target OPTION_MEETING = Target.the("option meeting").
            located(By.cssSelector("a[href='/demo/Meeting/Meeting']"));
    public static final Target BUTTON_CREATE_MEETING = Target.the("button for create new meeting").
            located(By.xpath("//span[text()=' New Meeting']"));
    public static final Target INPUT_NAME = Target.the("write meeting name").
            located(By.name("MeetingName"));
    public static final Target LIST_TYPE = Target.the("deployment the diferents types meeting").
            located(By.id("select2-chosen-6"));
    public static final Target INPUT_TYPE = Target.the("write meeting type").
        located(By.id("s2id_autogen6_search"));
    public static final Target INPUT_NUMBER = Target.the("write number meeting").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target INPUT_DATE_START = Target.the("write start day of meeting").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECT_HOUR_START =Target.the("select start hour of meeting").
            located(By.xpath("(//select[@class='editor s-DateTimeEditor time'])[1]"));
    public static final Target INPUT_END_DATE = Target.the("write end day of meeting").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_END_HOUR = Target.the("select end hour of meeting").
            located(By.xpath("//select[@class='editor s-DateTimeEditor time']"));
    public static final Target LIST_LOCATION = Target.the("deployment the diferents location")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));
    public static final Target INPUT_LOCATION = Target.the("write location meeting")
            .located(By.id("s2id_autogen7_search"));
    public static final Target INPUT_UNIT = Target.the("write  business unit name")
            .located(By.id("s2id_autogen8_search"));
    public static final Target INPUT_ORGANIZEDBY = Target.the("write  organized meeting")
            .located(By.id("s2id_autogen9_search"));
    public static final Target INPUT_REPORTER = Target.the("write  reporter meeting")
            .located(By.id("s2id_autogen10_search"));
    public static final Target INPUT_ATTENDEE = Target.the("write  attendee meeting")
            .located(By.id("s2id_autogen12_search"));
    public static final Target LIST_UNIT = Target.the("deployment the diferents business unit")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));
    public static final Target LIST_ORGANIZED_BY = Target.the("deployment the diferents organized")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));
    public static final Target LIST_REPORTER = Target.the("deployment the diferents reporters")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));
    public static final Target LIST_ATTENDEE = Target.the("deployment the diferents attendee")
            .located(By.id("s2id_autogen11"));
    public static final Target BUTTON_SAVE = Target.the("button that save the meeting")
            .located(By.xpath("//span[text()=' Save']"));
}
