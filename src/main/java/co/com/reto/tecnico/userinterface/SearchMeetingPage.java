package co.com.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchMeetingPage {
    public static final Target NAME_MEETING = Target.the("")
            .located(By.xpath("//a[text()='MeetingTestt']"));
    public static final Target INPUT_NAME_MEETING = Target.the("")
            .located(By.cssSelector("input[title='enter the text to search for...']"));
}
