package co.com.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBusinessUnitPage {
    public static final Target NAME_BUSINESS_UNIT = Target.the("")
            .located(By.xpath("//a[text()='business-testt']"));
}