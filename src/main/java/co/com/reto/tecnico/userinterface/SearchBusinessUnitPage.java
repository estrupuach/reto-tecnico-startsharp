package co.com.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBusinessUnitPage {
    public static final Target NAME_BUSINESS_UNIT = Target.the("")
            .located(By.xpath("/html/body/main/section/div/div[3]/div[4]/div[3]/div/div[1]/div[2]"));

    public static final Target INPUT_NAME_BUSINESS_UNIT = Target.the("")
            .located(By.cssSelector("input[title='enter the text to search for...']"));
}