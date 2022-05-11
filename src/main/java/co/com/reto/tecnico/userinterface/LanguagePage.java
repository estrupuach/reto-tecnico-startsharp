package co.com.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LanguagePage extends PageObject {
    public static final Target LIST_LANGUAGE = Target.the("deployment language list")
            . located(By.xpath("(//a[@title='switch language'])[1]"));
    public static final Target LANGUAGE_PORTUGUESE = Target.the("")
            . located(By.xpath("(//a[text()='Portuguese'])[1]"));
    public static final Target ITEM_PANEL = Target.the("")
            . located(By.xpath("(//span[text()='Painel de instrumentos'])"));
}
